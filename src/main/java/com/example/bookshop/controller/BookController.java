package com.example.bookshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bookshop.entity.Book;
import com.example.bookshop.service.BookService;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) { this.bookService = bookService; }

    @GetMapping("/books")
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.listAll());
        return "book-list-user";
    }

    @GetMapping("/admin/add-book")
    public String addBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "add-book";
    }

    @PostMapping("/admin/add-book")
    public String addBookSubmit(@ModelAttribute Book book) {
        bookService.addBook(book);
        return "redirect:/books";
    }
}
