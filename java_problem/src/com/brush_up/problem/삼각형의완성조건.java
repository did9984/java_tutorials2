package com.brush_up.problem;

import java.util.Arrays;

public abstract class 삼각형의완성조건 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] sides = {5,9,8};
        Arrays.sort(sides);
        if (sides[0]+sides[1]>sides[2]) {
			System.out.println(1);
		}else {
			System.out.println(2);
		}
	}

}
