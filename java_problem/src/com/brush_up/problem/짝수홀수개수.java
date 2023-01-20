package com.brush_up.problem;

public class 짝수홀수개수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 2, 3, 4, 5 };
		int[] answer = new int[2];
		for (int i=0;i<num.length;i++) {
			answer[num[i]%2]++;
			
		}System.out.println(answer[0]);
		System.out.println(answer[1]);
	}

}
