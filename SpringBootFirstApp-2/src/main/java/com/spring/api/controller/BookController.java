package com.spring.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

	private final BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
}
