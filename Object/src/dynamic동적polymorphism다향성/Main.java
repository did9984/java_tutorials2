package dynamic동적polymorphism다향성;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sca = new Scanner(System.in);
		Animal animal;
		
		System.out.println("what animal do you want?");
		System.out.println("(1=dog)or(2=cat):");
		int choice =sca.nextInt();
		
		if (choice==1) {
			animal = new Dog();
			animal.speak();
		}
		else if (choice ==2) {
			animal = new Cat();
			animal.speak();
		}else {
			animal = new Animal();
			System.out.println("That choice was invalid "); //invalid 유효하지않은 
			animal.speak();
		}
		
		
	}

}
