package com.yedam.exam05;

import java.util.Random;
import java.util.Scanner;

public class brush_up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input;
		int dice = 0;
		int[] dicearray =null;
		Random ran = new Random();
	quit:while (true) {
		System.out.println("===1.주사위 크기|2.주사위 굴리기|3.결과 보기|4.가장 많이 나온 수|5.종료===");
		System.out.println("메뉴 >");
		input = Integer.parseInt(sc.nextLine());
		switch (input) {
		case 1:
			System.out.println("5~10사이의 숫자를 입력하시오");
			dice = Integer.parseInt(sc.nextLine());
			if (5 > dice || 10 < dice ) {
				System.out.println("5~10사이의 숫자가아닙니다");
				break;
			}
			
			break;
		case 2:
			boolean quit2 = true;
			int i =0;
			dicearray =new int[dice];
			while (quit2) {
				i++;
				int random = ran.nextInt(6)+1;
				dicearray[random-1]++;
				if (random ==5) {
					quit2 = false;
				}
			}System.out.println("5가 나올때까지 실행된 횟수는"+i+"입니다");
			break;
			
		case 3:
			for (int j = 0; j < dicearray.length; j++) {
			   System.out.println(j+1+":"+dicearray[j]);
			}
			break;
		case 4:
			int max =0;
			for (int j = 0; j < dicearray.length; j++) {
				if (max<dicearray[j]) {
					max=j+1;
				}
			}System.out.println("가장많이나온수는:"+max+"입니다");
			break;
		case 5:
			System.out.println("종료");
			break quit;
		}
		
			
		}
		
		
	}

}
