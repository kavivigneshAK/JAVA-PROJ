package com.example.bookshop.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bookshop.entity.CartItem;
import com.example.bookshop.entity.Order;
import com.example.bookshop.entity.OrderItem;
import com.example.bookshop.entity.User;
import com.example.bookshop.repository.OrderRepository;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Transactional
    public void createOrder(User user, List<CartItem> cartItems) {
        Order order = new Order();
        order.setUser(user);
        order.setOrderTime(LocalDateTime.now());

        List<OrderItem> items = cartItems.stream().map(cartItem -> {
            OrderItem oi = new OrderItem();
            oi.setBook(cartItem.getBook());
            oi.setQuantity(cartItem.getQuantity());
            return oi;
        }).collect(Collectors.toList());

        order.setItems(items);
        orderRepository.save(order);
    }

    public List<Order> getOrders(User user) {
        return orderRepository.findByUser(user);
    }
}
