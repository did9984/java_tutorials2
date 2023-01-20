package com.brush_up.problem;


import java.util.Scanner;

public class 알람 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int H =sc.nextInt(); //시
    int M =sc.nextInt(); // 분
    sc.close();
    if (M < 45 ) { // 분이 45 보다 작을시 
		H --;      // 시 -1 
		M= 60-(45-M); // 분 60 - 45 -분 
	if (H <0) {
		H= 23;    // 0 이하로 갈시 23 
	} 
	System.out.println(H+" "+M);
	}else {
		System.out.println(H+" " +(M-45)); // 45 이상은 -45 
	}
	}

}
