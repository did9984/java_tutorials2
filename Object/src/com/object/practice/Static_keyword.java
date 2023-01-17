package com.object.practice;

public class Static_keyword {
 static String nameString;
 static int numberofFriends;
 public Static_keyword(String name) {
	// TODO Auto-generated constructor stub
	 this.nameString =name;
	 numberofFriends++;
}
 static void displayFriends() {
	 System.out.println("your friend is"+numberofFriends);
 }
}
