package 숙제0117_3;

import java.util.Scanner;

public class RPGgame implements Keypad {
 
 protected int currentMode ; // 0 = 노말모드 1 = 하드모드 
	Scanner sc =new Scanner(System.in);
	@Override
	public void leftUpButton() {
		// TODO Auto-generated method stub
		System.out.println("캐릭터가 위쪽으로 이동한다 ");
	}

	@Override
	public void leftDownButton() {
		// TODO Auto-generated method stub
		System.out.println("캐릭터가 아래쪽으로 이동한다");
	}

	@Override
	public void rightUpButton() {
		// TODO Auto-generated method stub
		if (currentMode == Keypad.NORMAL_MODE) { //노말
			System.out.println("캐릭터가 한칸단위로 점프한다");
		}else if(currentMode ==Keypad.HARD_MODE) { //하드
			System.out.println("캐릭터가 두칸단위로 점프한다");
		}
	}

	@Override
	public void rightDownButton() {
		
		if (currentMode == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격");
		}else if (currentMode ==Keypad.HARD_MODE) {
			System.out.println("캐릭터가 HIT 공격.");
		}
			 
	}
		
	

	@Override
	public void changeMode() {
		System.out.println("0:보통 1: 하드 모드변경>");
		currentMode=Integer.parseInt(sc.nextLine());
		//모드변경
		if (currentMode == 0) { //노말 
			System.out.println("현재모드:NORMAL MODE");
		}
		
		else if(currentMode ==1) {//하드 
			System.out.println("현재모드:Hard MODE");
		}
		// TODO Auto-generated method stub
		
	}
}
