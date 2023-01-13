package com.practice.Java;

import java.util.ArrayList;

public class for_eachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     int[] array = {1,2,3,4,5};
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("!");
		array.add("!");
		array.add("!");
		array.add("!");
		array.add("!");
		for (String i: array) {
			System.out.print(i+" ");
		}
	}
	}


