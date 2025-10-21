package com.example.bookshop.service;

import com.example.bookshop.entity.*;
import com.example.bookshop.repository.CartItemRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartService {
    private final CartItemRepository cartItemRepository;

    public CartService(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }

    public void addToCart(User user, Book book) {
        CartItem item = new CartItem();
        item.setUser(user);
        item.setBook(book);
        item.setQuantity(1);
        cartItemRepository.save(item);
    }

    public List<CartItem> getCartItems(User user) {
        return cartItemRepository.findByUser(user);
    }

    public void clearCart(User user) {
        cartItemRepository.deleteByUser(user);
    }
}
