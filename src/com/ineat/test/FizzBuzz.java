package com.ineat.test;

public class FizzBuzz {
  public static void main(String[] args){
    for(int i = 0; i<=100; i++){
      System.out.println(isFizzorBuzz(i));
    }
  }
  public static String isFizzorBuzz(int number){
    if(number%5 == 0 && number%3!= 0){
      return "Buzz";
    }
    if(number%3 == 0 && number%5!= 0){
      return "Fizz";
    }
    if(number%3 == 0 && number%5== 0){
      return "FizzBuzz";
    }
    return Integer.toString(number);
  }
}
