package com.example.Cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Book;
import com.example.Repo.BooksRepository;
import com.example.service.BooService;
import com.example.serviceImpl.BookImpl;

@RestController
@RequestMapping("/bookservice/books")
public class BooksController {

	@Autowired
	BooService bookrepo;
	
	@PostMapping
	public Book addBooks(@RequestBody Book book) {
		
	Book boo = bookrepo.addBooks(book);	
		return boo;
		
	}
	
	
	
}
