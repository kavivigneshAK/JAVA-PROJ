package com.example.bookshop.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.bookshop.entity.Book;
import com.example.bookshop.service.BookService;

@Controller
public class BookController {

    private final BookService bookService;
    @Value("${bookshop.upload.dir}")
    private String uploadDir;

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
    public String addBookSubmit(@ModelAttribute Book book, @RequestParam(value = "coverFile", required = false) MultipartFile file) throws IOException {
        // Handle file upload if provided
        if (file != null && !file.isEmpty()) {
            try {
                // Create directory if it doesn't exist
                Files.createDirectories(Paths.get(uploadDir));

                String filename = file.getOriginalFilename();
                file.transferTo(new File(uploadDir + filename));
                book.setCoverImage(filename);
            } catch (IOException e) {
                // If file upload fails, continue without image
                System.err.println("Failed to upload file: " + e.getMessage());
            }
        }

        bookService.addBook(book);
        return "redirect:/books";
    }
}
