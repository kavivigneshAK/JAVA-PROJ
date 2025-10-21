package com.example.bookshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookshop.entity.CartItem;
import com.example.bookshop.entity.User;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    List<CartItem> findByUser(User user);
    void deleteByUser(User user);
}
