package com.practice.Java;

public class 배열뒤집기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. 
//		num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
		int[] num_list = {3,4,5,4,2,6};
		
		for (int i = 1; i <= num_list.length; i++) {
			System.out.println(num_list[num_list.length-i]);
			
		
		}
		
	}

}
