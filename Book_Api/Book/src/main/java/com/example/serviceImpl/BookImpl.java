package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Book;
import com.example.Repo.BooksRepository;
import com.example.service.BooService;

@Service
public class BookImpl implements BooService {

	
	@Autowired
	BooksRepository bookrepo;
	
	public Book addBooks(Book book) {
		
		
		
		return bookrepo.save(book);
	
	}

}
