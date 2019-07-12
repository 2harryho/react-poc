package com.example.reactpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class ReactPocApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(ReactPocApplication.class, args);
  }

  @Bean
  public Random random() {
    return new Random();
  }

}
