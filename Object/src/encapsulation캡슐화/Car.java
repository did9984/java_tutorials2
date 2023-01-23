package encapsulation캡슐화;

public class Car {
	
	private String make;
	private String model;
	private int year;
	
	Car(String make,String model,int year){
		this.setMake(make);
		this.model =model;
		this.year =year;
	}
	
	public String getmake() {
		return make;
	}
	public String getmodel() {
		return model;
	}
	public int getyear() { // private 로 묶여있어서 못불러오는거를
		return year;       // 캡슐화해서 불러올수있게 만든다 
	}
	
	public void setMake(String make) {
		this.make= make;
	}
	public void setModel(String model) {
		this.model= model;
	}
	public void setyear(int year) {
		this.year= year;
	}

}
