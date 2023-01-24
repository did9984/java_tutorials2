package grid격자무늬layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JFrame fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(500,500);
		fr.setLayout(new GridLayout(3,3,10,10)); // row,colums,여백,여백 
	
		fr.add(new JButton("1"));
		fr.add(new JButton("2"));
		fr.add(new JButton("3"));
		fr.add(new JButton("4"));
		fr.add(new JButton("5"));
		fr.add(new JButton("6"));
		fr.add(new JButton("7"));
		fr.add(new JButton("8"));
		fr.add(new JButton("9"));
		fr.add(new JButton("10"));
		
		
		
		fr.setVisible(true);
	}

}
