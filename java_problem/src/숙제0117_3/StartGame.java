package 숙제0117_3;

import java.util.Random;
import java.util.Scanner;

public class StartGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keypad game = new RPGgame();
		Keypad[] game3 = {game,game=new ArcadeGame()};
		Random ra = new Random(); 
		boolean coin =true;
		int select;
		Scanner sc =new Scanner(System.in);
		System.out.println(game3[0]);
while (coin) {
	int ran = ra.nextInt(2);
	
     game = game3[ran];
	System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
	select = Integer.parseInt(sc.nextLine());
	switch (select) {
	case 1:
		game.leftUpButton();
		break;
	case 2:
		game.rightUpButton();
		break;
	case 3:
		game.rightUpButton();
		break;
	case 4:
		game.rightDownButton();
		break;
	case 5:
		game.changeMode();
		break;
	case 0:
		game = game3[ran];
		 break;
	case 9:
		coin =false;
		break;
	
		
	}
	
	


}
	}
}
