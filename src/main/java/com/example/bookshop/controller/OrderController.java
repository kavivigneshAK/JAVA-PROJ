package com.example.bookshop.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bookshop.entity.User;
import com.example.bookshop.repository.UserRepository;
import com.example.bookshop.service.CartService;
import com.example.bookshop.service.OrderService;

@Controller
public class OrderController {
    private final OrderService orderService;
    private final CartService cartService;
    private final UserRepository userRepository;

    public OrderController(OrderService orderService, CartService cartService, UserRepository userRepository) {
        this.orderService = orderService;
        this.cartService = cartService;
        this.userRepository = userRepository;
    }

    @PostMapping("/order/place")
    @Transactional
    public String placeOrder(Authentication auth) {
        User user = userRepository.findByUsername(auth.getName());
        var items = cartService.getCartItems(user);
        if (!items.isEmpty()) {
            orderService.createOrder(user, items);
            cartService.clearCart(user);
        }
        return "redirect:/orders";
    }

    @GetMapping("/orders")
    public String viewOrders(Authentication auth, Model model) {
        User user = userRepository.findByUsername(auth.getName());
        model.addAttribute("orders", orderService.getOrders(user));
        return "order-history";
    }
}
