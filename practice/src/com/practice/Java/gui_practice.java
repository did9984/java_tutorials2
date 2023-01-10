package com.practice.Java;

import java.util.Scanner;

public class gui_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String nameString = input.nextLine();
		System.out.println("Hello "+ nameString);
		System.out.println("How old are you?");
		int age = input.nextInt();
		input.nextLine();
		System.out.println("your age is "+ age);

	}

}
