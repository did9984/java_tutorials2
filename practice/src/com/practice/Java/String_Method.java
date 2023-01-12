package com.practice.Java;

public class String_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "  Bro";

//		boolean result =name.equals("Bro"); // true
//		int result = name.length();  // 3
//		char result = name.charAt(0); // B 
//		int result = name.indexOf("B"); // 0
//		boolean result = name.isEmpty(); // 0
//		String result = name.toUpperCase(); // BRO
//		String result = name.toLowerCase(); // bro
//		String result =name.trim();
		String result = name.replace("o", "a"); //Bra
		System.out.println(result);
	}

}
