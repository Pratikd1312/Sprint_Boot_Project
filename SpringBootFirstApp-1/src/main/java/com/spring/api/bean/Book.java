package com.spring.api.bean;

import java.beans.JavaBean;

import org.springframework.beans.factory.annotation.Value;

@JavaBean
public class Book {

	@Value("id")
	private int id;
	
	@Value("name")
	private String name;
	
	@Value("name")
	private String author;
	
	public Book(){
		
	}

	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
