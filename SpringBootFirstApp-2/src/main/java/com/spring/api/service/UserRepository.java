package com.spring.api.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.api.bean.Book;

@Repository
public interface UserRepository extends CrudRepository<Book, Integer>{

}
