package com.example.bookshop.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.bookshop.entity.Book;
import com.example.bookshop.entity.User;
import com.example.bookshop.repository.BookRepository;
import com.example.bookshop.repository.UserRepository;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initializeData(UserRepository userRepository, BookRepository bookRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            // Initialize Users
            if (userRepository.findByUsername("admin") == null) {
                User admin = new User();
                admin.setUsername("admin");
                admin.setPassword(passwordEncoder.encode("admin123"));
                admin.setRole("ROLE_ADMIN");
                userRepository.save(admin);
                System.out.println("✓ Admin user created: admin / admin123");
            }

            if (userRepository.findByUsername("user") == null) {
                User testUser = new User();
                testUser.setUsername("user");
                testUser.setPassword(passwordEncoder.encode("user123"));
                testUser.setRole("ROLE_USER");
                userRepository.save(testUser);
                System.out.println("✓ Test user created: user / user123");
            }

            // Initialize Sample Books
            if (bookRepository.count() == 0) {
                Book book1 = new Book();
                book1.setTitle("The Great Gatsby");
                book1.setAuthor("F. Scott Fitzgerald");
                book1.setPrice(12.99);
                bookRepository.save(book1);

                Book book2 = new Book();
                book2.setTitle("To Kill a Mockingbird");
                book2.setAuthor("Harper Lee");
                book2.setPrice(14.99);
                bookRepository.save(book2);

                Book book3 = new Book();
                book3.setTitle("1984");
                book3.setAuthor("George Orwell");
                book3.setPrice(13.99);
                bookRepository.save(book3);

                Book book4 = new Book();
                book4.setTitle("Pride and Prejudice");
                book4.setAuthor("Jane Austen");
                book4.setPrice(11.99);
                bookRepository.save(book4);

                Book book5 = new Book();
                book5.setTitle("The Catcher in the Rye");
                book5.setAuthor("J.D. Salinger");
                book5.setPrice(15.99);
                bookRepository.save(book5);

                System.out.println("✓ 5 sample books created");
            }
        };
    }
}

