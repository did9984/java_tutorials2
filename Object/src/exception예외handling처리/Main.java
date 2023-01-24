package exception예외handling처리;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {

			System.out.println("Enter a whole number to divide: ");
			int x = scanner.nextInt();

			System.out.println("Enter a whole number to divide by: ");
			int y = scanner.nextInt();

			int z = x / y;

			System.out.println("result: " + z);
		} catch (ArithmeticException e) { // 계산식이 맞지 않을시 
			System.out.println("You can't divide by zero! IDIOT!");
		} catch (InputMismatchException e) { //형태가 맞지 않을시 
			System.out.println("PLEASE ENTER A NUMBER OMFG!!!");
		} catch (Exception e) { // 모든예외
			System.out.println("Something went wrong");
		} finally {

			scanner.close();
		}
	}

}
