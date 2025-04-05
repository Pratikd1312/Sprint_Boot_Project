package com.spring.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.api.bean.Book;
import com.spring.api.service.BookService;

@RestController
public class BookController {
	
	/*
	 * @Autowired private BookService bookService;
	 */
	
	List<Book> list = new ArrayList<Book>();

	@GetMapping("/books")
	public Book getBooks() {
		Book b = new Book();
		b.setId(101);
		b.setName("Java");
		b.setAuthor("Hari Krishana");
		
		return b;
	}
	
	@PostMapping("/setAndGet")
	public Book setAndGetBook(@RequestBody Book book) {
		
		Book b = new Book(book.getId(), book.getName(), book.getAuthor());
		list.add(b);
		return b;
	}
	
	@GetMapping("/getAllBooks")
	public List<Book> getAllBook(){
		
		return list;
	}
	
	@DeleteMapping("/deleteBook")
	public String deleteBook(int id) {
		
		return "";
	}
	
	@GetMapping("/getBookById")
	public Book getBookById(@RequestBody Object reqId ) {
		int id = (Integer) reqId;
		Book b = new Book();
		for(Book book : list) {
			if(id == book.getId()) {
				return book;
			}
		}
		return b;
	}
}
