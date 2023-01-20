
package audio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		File fi = new File("C:\\Users\\82108\\git\\java_tutorials2\\Object\\src\\audio\\Ice  Fire - King Canyon.wav"); // 음악파일 불러오기 
		AudioInputStream audio = AudioSystem.getAudioInputStream(fi);  
		Clip cl = AudioSystem.getClip(); // 음악 파일 실행,종료,리셋 하기위해 필요 
		cl.open(audio); //음악 파일 열기 

		String response = ""; // switch 문에 조건부여

		while (!response.equals("Q")) { // true
			System.out.println("P = play, S = stop, R = reset, Q =Quit");
			System.out.println("Enter your choice");

			response = sc.next();
			response = response.toUpperCase();

			switch (response) {
			case ("P"):
				cl.start();//실행
				break;
			case ("S"):
				cl.stop();//정지
				break;
			case ("R"):
				cl.setMicrosecondPosition(0); //리셋
				break;
			case ("Q"):
				cl.close(); // 종료 
				break;
			default:
				System.out.println("Not a valid response");
			}

		}
	}

}
