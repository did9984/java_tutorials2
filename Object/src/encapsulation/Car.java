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
		return nameString; // private 로 묶어져있는 변수는 public으로 encapsulation 안하면 불러오기불가
	}

	public int year() {
		return year;
	}

	public String modelString() {
		return modelString;
	}
}
