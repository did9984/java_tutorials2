package fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		try {
			FileReader fi = new FileReader("C:\\Users\\82108\\git\\java_tutorials2\\Object\\src\\poem.txt");
			int data = fi.read();
			while (data != -1) {
				System.out.print((char)data);
				data = fi.read();
			}
			fi.close();
		} catch (FileNotFoundException e) { // FileReader를 사용하기위해 필요
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) { //read()를 사용하기 위해 필요
			e.printStackTrace();
		}
	}

}
