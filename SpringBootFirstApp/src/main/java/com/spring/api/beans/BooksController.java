package com.spring.api.beans;

import org.springframework.stereotype.Controller;

@Controller
public class BooksController {

	@RequestMapping()
	public Books getBooks() {
		Books b = new Books();
		
		b.setId(101);
		
		b.setName("Spring Core");
		
		b.setAuthor("Hari Krishana");
	}
}
