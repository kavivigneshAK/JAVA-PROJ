package com.example.bookshop.service;

import com.example.bookshop.entity.*;
import com.example.bookshop.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void createOrder(User user, List<CartItem> cartItems) {
        Order order = new Order();
        order.setUser(user);

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
