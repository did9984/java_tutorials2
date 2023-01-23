package borderlayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(500,500);
		fr.setVisible(true);
		fr.setLayout(new BorderLayout(10,10)); // width ,height 레이아웃 여백 
		
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.blue);
		panel3.setBackground(Color.green);
		panel4.setBackground(Color.yellow);
		panel5.setBackground(Color.BLACK);
		
		panel5.setLayout(new BorderLayout());
		
		panel1.setPreferredSize(new Dimension(100,100)); //height, width 
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		//  ----sub panel ----
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(Color.pink);
		panel7.setBackground(Color.darkGray);
		panel8.setBackground(Color.orange);
		panel9.setBackground(Color.white);
		panel10.setBackground(Color.lightGray);
		
		panel6.setPreferredSize(new Dimension(50,50)); //height, width 
		panel7.setPreferredSize(new Dimension(50,50)); //height, width 
		panel8.setPreferredSize(new Dimension(50,50)); //height, width 
		panel9.setPreferredSize(new Dimension(50,50)); //height, width 
		panel10.setPreferredSize(new Dimension(50,50)); //height, width 
	
		
		
		panel5.setLayout(new BorderLayout());
		
		fr.add(panel1,BorderLayout.NORTH);
		fr.add(panel2,BorderLayout.WEST);
		fr.add(panel3,BorderLayout.EAST);
		fr.add(panel4,BorderLayout.SOUTH);
		fr.add(panel5,BorderLayout.CENTER);
		
		
		panel5.add(panel6,BorderLayout.NORTH);
		panel5.add(panel7,BorderLayout.SOUTH);
		panel5.add(panel8,BorderLayout.WEST);
		panel5.add(panel9,BorderLayout.EAST);
		panel5.add(panel10,BorderLayout.CENTER);
		
		
	}

}
