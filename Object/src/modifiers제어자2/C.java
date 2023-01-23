package modifiers제어자2;
import modifiers제어자.*;

public class C {
	
	public String pumessage = "This is public"; //public 은 모든 패키지에서 사용가능 
	protected String promessage = "This is protected";//protected 는 패키지 간의 공유는 안되지만 같은 패키지 안은 가능하다
	String de = "This is the default";
	private String primessage = "This is private"; // private는 자신의 클래스 안에서만 가능 

}
