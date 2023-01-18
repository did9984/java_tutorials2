package polymorphism다향성;

public class Main {
	public static void main(String[] args) {
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car,bicycle,boat}; //부모태그에는 자식태그를 배열로 넣을수있다 
		for (Vehicle vehicle : racers) {
			vehicle.go();
		}
	}

}
