package com.object.practice;

public class Call_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     objectPassing ob = new objectPassing();
     objectPassing2 ob2 =new objectPassing2("BMW");
     objectPassing2 ob3 =new objectPassing2("Tesla");
     
     ob.park(ob2);
     ob.park(ob3 );
	}

}
