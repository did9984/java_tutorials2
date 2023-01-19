package objectPassing패스;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Garage garage = new Garage();

		Car car1 = new Car("BMW");
		Car car2 = new Car("Tesla");

		garage.park(car1); // extend 상속 을 사용하지않고 () 안에 클래스를 넣으면 불러오기가 가능하다 
		garage.park(car2);
	}

}
