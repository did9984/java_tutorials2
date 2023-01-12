package com.practice.Java;

import javax.swing.JOptionPane;

public class logical_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String input = JOptionPane.showInputDialog("quit is q or Q");
      if (input.equals("q") || input.equals("Q")){
		JOptionPane.showMessageDialog(null, "Thank you for playing game");
	}else {
		JOptionPane.showMessageDialog(null, "more playing game");
	}
	}

}
