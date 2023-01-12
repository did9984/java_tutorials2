package com.practice.Java;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열로 구구단 만들기
		int Mtable[][] = new int[8][9];
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				Mtable[i - 2][j - 1] = i * j;

			}

		}
		for (int i = 0; i < 8; i++) {
			System.out.print(i+2+":단");
			System.out.print(Arrays.toString(Mtable[i]));
			System.out.println();
		}

	}

}
