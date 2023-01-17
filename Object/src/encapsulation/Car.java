package encapsulation;

public class Car {

	private String nameString;
	private int year;
	private String modelString;

	Car(String nameString, int year, String modelString) {
		this.modelString = modelString;
		this.nameString = nameString;
		this.year = year;

	}

	public String name() {
		return nameString;
	}

	public int year() {
		return year;
	}

	public String modelString() {
		return modelString;
	}
}
