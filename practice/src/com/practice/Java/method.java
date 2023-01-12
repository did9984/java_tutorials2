package com.practice.Java;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		name("park",27);
	    System.out.println(sum(10, 20));
	}

	static void name(String n,int age) {
		System.out.println(n);
		System.out.println(age);
	}
	
	static int sum(int x, int b){
		return x+b;
	}
}
