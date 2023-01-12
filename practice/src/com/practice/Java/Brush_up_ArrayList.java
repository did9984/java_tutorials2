package com.practice.Java;

import java.util.ArrayList;

public class Brush_up_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> nameArrayList = new ArrayList<String>();
        nameArrayList.add("kim");
        nameArrayList.add("park");
        nameArrayList.add("choi");
        
        nameArrayList.set(0, "jung"); // 0번째 내용 변화 
        nameArrayList.remove(1);// 1번째 내용삭제 
        nameArrayList.clear(); // 전부삭제 
        System.out.println(nameArrayList.get(0));
	}

}
