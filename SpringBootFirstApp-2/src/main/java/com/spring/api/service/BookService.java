package com.spring.api.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.api.bean.Book;

public class BookService {

	/*
	 * @Autowired public UserRepository ur;
	 * 
	 * public void addBook(Book book) {
	 * 
	 * }
	 */
	
	
	private final UserRepository userRepository;

    @Autowired
    public BookService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public Book saveBook(Book book) {
        return userRepository.save(book);
    }
}
