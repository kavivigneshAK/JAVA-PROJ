package com.example.bookshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookshop.entity.Order;
import com.example.bookshop.entity.User;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
}
