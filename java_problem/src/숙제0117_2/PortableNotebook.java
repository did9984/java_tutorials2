package 숙제0117_2;

import java.util.Scanner;

public class PortableNotebook implements Tablet,Notebook {
	Scanner sc = new Scanner(System.in);
   int mode;
   String doucment;
   String browser;
   String video;
   String app;
	@Override
	public void writeDocumentation() {
		// TODO Auto-generated method stub
		System.out.println("문서>");
		doucment =sc.nextLine();  //터미널에서 문서입력 
		System.out.println(doucment+"문서를통해작성");
		
	}
	
	

	@Override
	public void searchInternet() {
		// TODO Auto-generated method stub
		System.out.println("인터넷>");
		browser =sc.nextLine();//터미널에서 사용인터넷입력 
		System.out.println(browser+"를 통해 인터넷을 검색");
	}

	@Override
	public void useApp() {
		// TODO Auto-generated method stub
		System.out.println("1: 노트북모드 2:테이블모드");  //
		mode = Integer.parseInt(sc.nextLine());
		if (mode == 1) {
			System.out.println("종료");
			System.out.println("실행");
		}else if(mode ==2) {
			System.out.println("종료");
			System.out.println("실행");
		}
	}

	@Override
	public void watchVideo() {
		// TODO Auto-generated method stub
		System.out.println("영상>");
		video =sc.nextLine();//터미널에서 영상입력 
		System.out.println(video+"를 시청");
		
	}

}
