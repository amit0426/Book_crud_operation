package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="books")
public class Book {
	@Id
	private Long id;
	@Column
	private String book_name;
	@Column
	private String author_name;
	@Column
	private String  publicatation;
	@Column
    private String category;
	@Column
    private long pages;
	@Column
    private int price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Long id, String book_name, String author_name, String publicatation, String category, long pages,
			int price) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.author_name = author_name;
		this.publicatation = publicatation;
		this.category = category;
		this.pages = pages;
		this.price = price;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String getPublicatation() {
		return publicatation;
	}
	public void setPublicatation(String publicatation) {
		this.publicatation = publicatation;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getPages() {
		return pages;
	}
	public void setPages(long pages) {
		this.pages = pages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
