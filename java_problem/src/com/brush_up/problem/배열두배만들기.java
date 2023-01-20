package com.brush_up.problem;

import java.util.ArrayList;

public class 배열두배만들기 {
	public static void main(String[] args) {
		//정수 배열 numbers가 매개변수로 주어집니다. 
		//numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
		ArrayList<Integer> answer =new ArrayList<>();
		int[] numbers = {2, 4, 6, 8, 10};
		for (int i : numbers) {
			answer.add(i*2);
		}System.out.println(answer.get(1));
		
	}

}
