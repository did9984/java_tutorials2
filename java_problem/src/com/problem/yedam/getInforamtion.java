package com.problem.yedam;

public class getInforamtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ObesityInfo obe = new ObesityInfo("홍길동", 168, 45);
     ObesityInfo obe2 = new ObesityInfo("박둘이", 168, 90);
     
     System.out.println(obe.nameString+"님의 신장: "+obe.tall+"몸무게 "+obe.weight+"표준체중 "+obe.getStandardWeight());
     System.out.println(obe2.nameString+"님의 신장: "+obe2.tall+"몸무게 "+obe2.weight +"비만도: "+obe2.getObesity());
	}

}
