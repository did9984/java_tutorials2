package fileClass;

import java.io.File;

import arrayOfObject객체배열.Food;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File fi = new File("C:\\Users\\82108\\git\\java_tutorials2\\Object\\src\\fileClass\\secret_message.txt");  //   \\->/ 로 바꾸어도 작동 
		
		if (fi.exists()) {
			System.out.println("That file exists! :O!");
			System.out.println(fi.getPath());  //File(주소) 출력  
			System.out.println(fi.getAbsolutePath()); // 파일 주소 출력
			System.out.println(fi.isFile()); //파일 있을시 true 로출력  
			fi.delete(); //경로안에 파일 삭제 
		}else {
			System.out.println("That file doesn't exist:(");
		}

	}

}
