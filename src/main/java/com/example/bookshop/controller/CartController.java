package com.example.bookshop.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bookshop.entity.Book;
import com.example.bookshop.entity.User;
import com.example.bookshop.repository.CartItemRepository;
import com.example.bookshop.repository.UserRepository;
import com.example.bookshop.service.BookService;
import com.example.bookshop.service.CartService;

@Controller
public class CartController {
    private final CartService cartService;
    private final UserRepository userRepository;
    private final BookService bookService;
    private final CartItemRepository cartItemRepository;

    public CartController(CartService cartService, UserRepository userRepository, BookService bookService, CartItemRepository cartItemRepository) {
        this.cartService = cartService;
        this.userRepository = userRepository;
        this.bookService = bookService;
        this.cartItemRepository = cartItemRepository;
    }

    @PostMapping("/cart/add/{bookId}")
    public String addToCart(Authentication auth, @PathVariable Long bookId) {
        User user = userRepository.findByUsername(auth.getName());
        Book book = bookService.listAll().stream().filter(b -> b.getId().equals(bookId)).findFirst().orElse(null);
        if (book != null) cartService.addToCart(user, book);
        return "redirect:/books";
    }

    @GetMapping("/cart")
    public String viewCart(Authentication auth, Model model) {
        User user = userRepository.findByUsername(auth.getName());
        var cartItems = cartService.getCartItems(user);
        model.addAttribute("cartItems", cartItems);

        // Calculate total
        double total = cartItems.stream()
            .mapToDouble(item -> item.getBook().getPrice() * item.getQuantity())
            .sum();
        model.addAttribute("cartTotal", total);

        return "cart";
    }

    @PostMapping("/cart/remove/{itemId}")
    @Transactional
    public String removeFromCart(@PathVariable Long itemId) {
        cartItemRepository.deleteById(itemId);
        return "redirect:/cart";
    }
}
