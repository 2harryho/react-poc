package com.example.reactpoc.api.number;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomNumberController {

  private final RandomNumberService randomNumberService;

  public RandomNumberController(RandomNumberService randomNumberService) {
    this.randomNumberService = randomNumberService;
  }

  @GetMapping("/api/randomnumber")
  public ResponseEntity<Integer> create() {
    return randomNumberService.create();
  }
}
