package com.jwtme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JwtmeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtmeApplication.class, args);
	}

	@RequestMapping("/home")
	public String hello() {
		
		return "Hello Buddy!";
	}
}
