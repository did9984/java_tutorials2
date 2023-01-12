package com.practice.Java;

import java.util.Scanner;

public class while_loop_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     String name = "";
     while (name.isBlank()) {
        System.out.println("Enter your name");
        name =sc.nextLine();
	}
	}

}
