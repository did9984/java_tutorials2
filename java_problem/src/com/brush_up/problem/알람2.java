package com.brush_up.problem;

import java.util.Scanner;

public class 알람2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      int H = scanner.nextInt();
      int M = scanner.nextInt();
      if (M < 45) {
		H--;
		M = 60 - (45-M);
	if (H < 0) {
		H = 23 ;
	}System.out.println(H+" "+ M);
      }
	else {
		System.out.println(H+" "+(M-45));
	}
	
	
	}

}
