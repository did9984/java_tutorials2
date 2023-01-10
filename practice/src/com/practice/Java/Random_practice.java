package com.practice.Java;

import java.util.Random;

public class Random_practice {
  public static void main(String[] args) {
    
	  Random mathRandom = new Random();
	  int x = mathRandom.nextInt(6)+1; // random 숫자
	  double y = mathRandom.nextDouble();
	  boolean zString  = mathRandom.nextBoolean();
	  System.out.println(x);
	  System.out.println(y);
	  System.out.println(zString);
  }
}
