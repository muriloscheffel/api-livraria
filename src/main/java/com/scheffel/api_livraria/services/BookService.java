package com.scheffel.api_livraria.services;

import com.scheffel.api_livraria.entities.Book;
import com.scheffel.api_livraria.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public List<Book> findAll() {
        return this.repository.findAll();
    }

    public void save(Book book) {
        this.repository.save(book);
    }
}
