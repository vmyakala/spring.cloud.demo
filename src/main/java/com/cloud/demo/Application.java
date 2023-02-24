package com.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	
	@GetMapping
	public String message() {
		return " If you are seeing this, your deployment is done !! ";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
