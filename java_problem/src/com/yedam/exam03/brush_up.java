package com.yedam.exam03;

public class brush_up {
 public static void main(String[] args) {
	 int[] coinUnit = new int[4];
		int money = 2680;
		System.out.println("money=" + money);
		//500~10원 까지 잔돈을 받는갯수를 나오게하시오 
		for (int i = 0; i < 1; i++) {
			coinUnit[i]= money/500;
			money =money%500;
			coinUnit[i+1] = money/100;
			money = money%100;
			coinUnit[i+2] = money/50;
			money = money%50;
			coinUnit[i+3] =money/10;
		}System.out.println("잔돈:500원:" +coinUnit[0]);
 System.out.println("잔돈:100원:" +coinUnit[1]);
System.out.println("잔돈:50원:" +coinUnit[2]);
System.out.println("잔돈:10원:" +coinUnit[3]);

 
 }

}
