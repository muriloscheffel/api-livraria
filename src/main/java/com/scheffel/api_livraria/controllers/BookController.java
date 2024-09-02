package com.scheffel.api_livraria.controllers;

import com.scheffel.api_livraria.entities.Book;
import com.scheffel.api_livraria.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/findAll")
    public ResponseEntity<List<Book>> findAll() {
        try {
            List<Book> books = service.findAll();
            return new ResponseEntity<>(books, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Book book) {
        try {
            this.service.save(book);
            return new ResponseEntity<>("Book registered successfully" ,HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
