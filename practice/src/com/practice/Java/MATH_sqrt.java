package com.practice.Java;

import java.util.Scanner;



public class MATH_sqrt {
	public static void main(String[] args) {
	double x;
	double y; 
	double z; 
     Scanner numberScanner = new Scanner(System.in);
     System.out.println("X:");
     x =numberScanner.nextDouble();
     System.out.println("Y:");
     y =numberScanner.nextDouble();
     z=Math.sqrt((x*x)+(y*y)); // 삼각형 빗면은 밑변제곱+높이제곱 = 빗변제곱 
     System.out.println("hypotenus:"+z);
	}
}
