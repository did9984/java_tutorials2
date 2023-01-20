package 숙제0117;

import java.util.Scanner;

public class ArcadeGame implements Keypad {// 부모 태그 keypad
    protected int CurrentMode; //모드설정
    Scanner sc =new Scanner(System.in);
	@Override
	public void leftUpButton() {
		// TODO Auto-generated method stub
		System.out.println("캐릭터가 앞쪽으로 이동한다");
		
	}

	@Override
	public void leftDownButton() {
		// TODO Auto-generated method stub
		System.out.println("캐릭터가 뒤쪽으로 이동한다");
		
	}

	@Override
	public void rightUpButton() {
		// TODO Auto-generated method stub
		if (CurrentMode == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격");
		}else if(CurrentMode ==Keypad.HARD_MODE) {
			System.out.println("캐릭터가 연속 공격");
		}
	}

	@Override
	public void rightDownButton() {
		// TODO Auto-generated method stub
		if (CurrentMode ==Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 HIT공격");
		}else if (CurrentMode ==Keypad.HARD_MODE) {
			System.out.println("캐릭터가 Double HIT 공격.");
		}
		
	}

	@Override
	public void changeMode() {
		System.out.println("0:노말 1:하드 모드선택");
		CurrentMode =Integer.parseInt(sc.nextLine());
		// TODO Auto-generated method stub
		if (CurrentMode == Keypad.NORMAL_MODE) {
			this.CurrentMode = Keypad.NORMAL_MODE;
			System.out.println("현재 모드 : NORMAL_MODE");
		}else if (CurrentMode ==Keypad.HARD_MODE) {
			System.out.println("현재 모드 : HARD_MODE ");
		}
		
	}  

	

}
