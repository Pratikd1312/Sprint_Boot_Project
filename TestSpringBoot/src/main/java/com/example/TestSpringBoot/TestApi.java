package com.example.TestSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to My Project ";
	}

}
