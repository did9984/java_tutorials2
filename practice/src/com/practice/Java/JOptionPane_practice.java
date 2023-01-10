package com.practice.Java;

import javax.swing.JOptionPane;

public class JOptionPane_practice {
  public static void main(String[] args) {
	String nameString = JOptionPane.showInputDialog("Enter your name"); //() 안의 메세지가 출력  
	JOptionPane.showMessageDialog(null,"hello" + nameString); // name 값이 메세지로 출력 
	
	int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?")); // integer.parseint = int 로 변환 
	JOptionPane.showMessageDialog(null,"your age is" +age);
	
	double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height?"));
	JOptionPane.showMessageDialog(null,"your height is: "+height);
}
}
