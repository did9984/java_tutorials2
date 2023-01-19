package javaFileWirter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
     public static void main(String[] args) {
		try {
    	 FileWriter writer = new FileWriter("C:\\Users\\82108\\git\\java_tutorials2\\Object\\src\\javaFileWirter\\poem.txt");
    	 writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!"); //글자 작성 
    	 writer.append("\n(A poem by Bro)"); // 글자 추가 
    	 writer.close(); // 닫기 무조건적으로 추가해줘야된다 
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
