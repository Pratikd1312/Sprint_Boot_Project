package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.api.SpringBootFirstApp1Application;
import com.spring.api.bean.Book;
import com.spring.api.service.UserRepository;

@SpringBootApplication
public class SpringBootFirstApp2Application {

	/*
	 * public static void main(String[] args) { ApplicationContext context =
	 * (ApplicationContext)
	 * SpringApplication.run(SpringBootFirstApp2Application.class, args);
	 * 
	 * UserRepository userRepository = context.getBean(UserRepository.class);
	 * 
	 * Book book = new Book(); book.setName("sdad"); book.setAuthor("XYZ");
	 * 
	 * Book b = userRepository.save(book); System.out.println(b);
	 * 
	 * }
	 */
	public static void main(String[] args) {
		System.out.println("PratikTesting Jenkins");
		SpringApplication.run(SpringBootFirstApp2Application.class, args);
	}

}
