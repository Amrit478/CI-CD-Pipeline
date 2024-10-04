package com.example.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterApplication.class, args);
	}
	@GetMapping
	public String hello() {
		return "Hello World!";
	}
	@GetMapping
	public String hello1() {
		return "Hello World!";
	}	
}