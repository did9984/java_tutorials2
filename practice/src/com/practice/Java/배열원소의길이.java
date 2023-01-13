package com.practice.Java;

public class 배열원소의길이 {

	public static void main(String[] args) {
   //문자열 배열 strlist가 매개변수로 주어집니다. 
	//	strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
		String[] arrayStrings  = {"abc","bd","aaac","d","adcsss"};
		for (int i = 0; i < arrayStrings.length; i++) {
			System.out.println(arrayStrings[i].length());
		}
	}

}
