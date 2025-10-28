package com.example.bookshop.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bookshop.entity.Book;
import com.example.bookshop.entity.CartItem;
import com.example.bookshop.entity.User;
import com.example.bookshop.repository.CartItemRepository;

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

    @Transactional
    public void clearCart(User user) {
        cartItemRepository.deleteByUser(user);
    }
}
