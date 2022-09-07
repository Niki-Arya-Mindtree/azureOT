package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzuurrnodockOtApplication {

	@GetMapping("/us")
	public String print() 
	{return "Hello Azure and Github";}
	
	public static void main(String[] args) {
		SpringApplication.run(AzuurrnodockOtApplication.class, args);
	}

}
