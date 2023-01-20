package com.brush_up.problem;

public class 점의위치구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] dot = {1,3};
     int answer= 0;
    if (dot[0]>0) {
		if (dot[1]>0)
		{answer=1;} 
		else {
			answer=4;
		}
		if (dot[1]>0) {
			answer=2;}
			else {
				answer =3;
			}
		
		
	} System.out.println(answer);
	}
	

}
