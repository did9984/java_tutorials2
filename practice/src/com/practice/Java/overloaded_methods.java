package com.practice.Java;

public class overloaded_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = add(1.0 , 2.5);
		System.out.println(x);
	}

	static int add(int a, int b) {
		System.out.println("overload method1");
		return a + b;
	}

	static int add(int a, int b, int c) {
		System.out.println("overload method2");
		return a + b + c;
	}

	static int add(int a, int b, int c, int d) {
		System.out.println("overload method3");
		return a + b + c + d;
	}
	static double add(double a , double b ) {
		System.out.println("overload method1");
		return a + b ;
	}
	static double add(double a,double b, double c) {
		System.out.println("overload method2");
		return a + b + c;
	}
	static double add(double a, double b, double c, double d) {
		System.out.println("overload method3");
		return a + b + c + d;
	}
	
}
