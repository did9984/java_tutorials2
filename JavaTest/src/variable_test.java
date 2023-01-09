
public class variable_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a = 13; // int = 정수만 가능 
       double b = 1.5;  // double = 실수만 가능
       double bc = 3; // 정수만 입력시 실수로 출력 
       boolean d = true; // boolean = true,false 만가능 
       char f = 'f'; // char 은 하나의 문자만 저장가능  
      String c = "한글"; // String = 문자열
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(a-b); // 정수 -실수는 실수로 출력 
      System.out.println(bc); // 3.0 	
      System.out.println("이것은:"+c); // 문자열 옆에 변수 추가하는법 
      System.out.println(f);
      System.out.println(d); 
	}

}
