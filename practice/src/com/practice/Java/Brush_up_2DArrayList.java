package com.practice.Java;

import java.util.ArrayList;

public class Brush_up_2DArrayList {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> nameall = new ArrayList();
		ArrayList<String> name = new ArrayList<String>();
		name.add("park");
		name.add("park");
		name.add("park");
		ArrayList<String> name2 = new ArrayList<String>();
		name2.add("park2");
		name2.add("park2");
		name2.add("park2");
		ArrayList<String> name3 = new ArrayList<String>();
		name3.add("park3");
		name3.add("park3");
		name3.add("park3");
		
		nameall.add(name);
		nameall.add(name2);
		nameall.add(name3);
		System.out.println(nameall.get(2).get(0));
	}
}
