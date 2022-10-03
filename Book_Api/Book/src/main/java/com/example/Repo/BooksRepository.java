package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Book;

public interface BooksRepository extends JpaRepository<Book, Integer> {

}
