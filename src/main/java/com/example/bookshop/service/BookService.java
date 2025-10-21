package com.example.bookshop.service;

import com.example.bookshop.entity.Book;
import com.example.bookshop.repository.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public List<Book> listAll() {
        return bookRepository.findAll();
    }
}
