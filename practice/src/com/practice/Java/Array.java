package com.practice.Java;



public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String[] carString  = {"현대","쉐보레","포르쉐","BMW"};
     
     carString[0] = "아반떼";
     
     System.out.println(carString[3]);
     System.out.println();
     for (int i = 0; i < carString.length; i++) {
		System.out.println(carString[i]);
		
	}
     
    String[] food = new String[4];   // [] 괄호안에 숫자 만큼 배열 생산가능
    
    food[0] = "sandwhich";
    food[1] = "rice";
    food[2] = "bread";
    food[3] ="ramen";
   
 System.out.println();
    System.out.println(food[3]);
 	}

}
