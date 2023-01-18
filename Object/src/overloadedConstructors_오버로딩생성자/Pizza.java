package overloadedConstructors_오버로딩생성자;

public class Pizza {
	String bread;
	String sauce;
	String cheese;
	String topping;
	
	Pizza(){
		
	}
	
Pizza(String bread){  //String bread = 생성자 
		
		this.bread = bread;
	}
	
	Pizza(String bread,String sauce){
		
		this.bread = bread;
		this.sauce = sauce;
	}
	
	Pizza(String bread,String sauce,String cheese){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	
	Pizza(String bread,String sauce,String cheese,String topping){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
}
