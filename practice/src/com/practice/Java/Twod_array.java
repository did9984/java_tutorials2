package com.practice.Java;

public class Twod_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] num = { { "1", "2", "3","4" }, { "4", "5", "6","7" }, { "7", "8", "9","10","11" } };
		for (int i = 0; i < num.length; i++) {
         for (int j = 0; j < num[i].length; j++) {
			System.out.print(num[i][j]+" ");
			
		}System.out.println();
		}
	}

}
