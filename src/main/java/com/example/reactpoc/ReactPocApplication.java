package com.example.reactpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class ReactPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactPocApplication.class, args);
	}

	@Bean
	public Random random() {
		return new Random();
	}

}