package com.practice.Java;

import java.util.Scanner;



public class MATH_sqrt {
	public static void main(String[] args) {
		Scanner NUMBER = new Scanner(System.in);
		Double X;
		Double Y;
		Double Z;
		System.out.println("NUMBER X:");
		X = NUMBER.nextDouble();
		System.out.println("NUMBER Y:");
		Y= NUMBER.nextDouble();
		Z=Math.sqrt(((X*X)+(Y*Y)));
		System.out.println("hypotenus: "+ Z);
	}
}
