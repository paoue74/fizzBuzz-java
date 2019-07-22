package com.ineat.test;

import static com.ineat.test.FizzBuzz.isFizzorBuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @Test
  void shouldReturnNumber() {
    String result = isFizzorBuzz(1);
    assertEquals("1", result);
  }

  @Test
  void shouldReturnFizz() {
    String result = isFizzorBuzz(3);
    assertEquals("Fizz", result);
  }

  @Test
  void shouldReturnFizzIfMultipleOfThree() {
    String result = isFizzorBuzz(6);
    assertEquals("Fizz", result);
  }

  @Test
  void shouldReturnBuzz() {
    String result = isFizzorBuzz(5);
    assertEquals("Buzz", result);
  }

  @Test
  void shouldReturnBuzzIfMultipleOfFive() {
    String result = isFizzorBuzz(10);
    assertEquals("Buzz", result);
  }

  @Test
  void shouldReturnBuzzIfMultipleOfFiveAndThree() {
    String result = isFizzorBuzz(15);
    assertEquals("FizzBuzz", result);
  }
}