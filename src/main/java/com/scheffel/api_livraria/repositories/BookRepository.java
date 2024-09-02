package com.scheffel.api_livraria.repositories;

import com.scheffel.api_livraria.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
