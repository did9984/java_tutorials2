package inheritance계승;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Car car = new Car();
		  
		  car.stop();
		  
		  Bicycle bi =new Bicycle();
		  bi.go();
		  
		  System.out.println(car.speed);
		  System.out.println(bi.speed);
	}

}
