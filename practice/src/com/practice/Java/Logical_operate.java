package com.practice.Java;

import java.util.Scanner;

import javax.swing.JOptionPane;



public class Logical_operate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String quitString = JOptionPane.showInputDialog("you want game quit Press \"q\" or \"Q\"");
		
        if (quitString.equals("q")||quitString.equals("Q")) {
			JOptionPane.showMessageDialog(null,"Thank you for playing game");
			System.out.println("Thank you for playing game");
		}else if (!quitString.equals("q") || !quitString.equals("Q")) {
			JOptionPane.showMessageDialog(null,"you are still playing game");
			System.out.println("you are still playing game");
		}
			
		
	}

}
