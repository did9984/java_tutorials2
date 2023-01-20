package com.brush_up.problem;

import java.util.Arrays;
import java.util.Iterator;

public class 배열자르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, 
		// numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른
		// 정수 배열을 return 하도록 solution 함수를 완성해보세요.
		int[] numbers = {1,2,3,4,5};
		int num1 = 1;
		int num2 =3;
		
		
		
	int[]array2= Arrays.copyOfRange(numbers, 1, 4);
	for (int i : array2) {
		System.out.println(i);
	}
	 
	}

}
