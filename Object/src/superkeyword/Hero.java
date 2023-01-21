package superkeyword;

public class Hero extends Person{

	String power;
	
	Hero(String name,int age,String power) {
		super(name,age); //this.name , this.age 와 동일 
	    this.power= power;
	    
	}
	
	public String toString() { // 매개변수로 생성자를 생성할려면 {} 안에 return 이 있어야한다 
		return super.toString()+this.power;
	}
}
