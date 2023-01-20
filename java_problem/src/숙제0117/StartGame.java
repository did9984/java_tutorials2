package 숙제0117;

public class StartGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keypad game = new RPGgame();
		

		game.leftUpButton();
		game.rightUpButton();
		game.changeMode();
		game.rightUpButton();
		game.rightDownButton();
		game.leftDownButton();
		game.changeMode();
		game.rightDownButton();
System.out.println("===================");
		
		game = new ArcadeGame();
		game.leftUpButton();
		game.rightUpButton();
		game.leftDownButton();
		game.changeMode();
		game.rightUpButton();
		game.leftUpButton();
		game.rightDownButton();

	}

}
