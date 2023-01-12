package com.practice.Java;

import java.util.Scanner;

public class nested_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row; //행
		int colums; // 열 
	   String symbolString; // 
	   System.out.println("Enter rows");
	   row = sc.nextInt();
	   System.out.println("Enter colums");
	   colums =sc.nextInt();
	   System.out.println("Enter symbol");
	   symbolString =sc.next();
	   for (int i = 0; i < row; i++) {
		System.out.println();
		for (int j = 0; j < colums; j++) {
			System.out.print(symbolString);
		}
		
	}
	}
	
}
