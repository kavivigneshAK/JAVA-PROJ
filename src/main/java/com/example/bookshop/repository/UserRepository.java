package com.example.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookshop.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
