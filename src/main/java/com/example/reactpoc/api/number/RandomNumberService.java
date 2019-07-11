package com.example.reactpoc.api.number;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomNumberService {
  private final Random random;

  public RandomNumberService(Random random) {
    this.random = random;
  }

  public ResponseEntity<Integer> create() {
    return new ResponseEntity<>(random.nextInt(100), HttpStatus.OK);
  }
}
