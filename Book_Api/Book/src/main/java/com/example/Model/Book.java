package com.example.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "Book")
public class Book {
	@Id
private int Book_Id;
	@Column
private String name;
	@Column
private String author;
	@Column
private String  publicatation;
	@Column
private String category;
	@Column
private long pages;
	@Column
private int price;
 

}
