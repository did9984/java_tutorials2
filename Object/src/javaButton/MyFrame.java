package javaButton;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton button;
	JLabel label;
	
	MyFrame(){
		
//		ImageIcon icon = new ImageIcon("C:\\Users\\82108\\git\\java_tutorials2\\Object\\src\\javaButton\\unnamed.jpg");
		ImageIcon icon2 = new ImageIcon("C:\\Users\\82108\\git\\java_tutorials2\\Object\\src\\javaButton\\unnamed.jpg");
		
		label =new JLabel();
		label.setIcon(icon2);
		label.setBounds(150,250,150,150);
		label.setVisible(false);
		
		button =new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this);
		button.setText("i'm button");
		button.setFocusable(false);
//		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setIconTextGap(-15);
		button.setForeground(Color.cyan);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) { // 버튼 액션
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
//			System.out.println("poo");
//			button.setEnabled(true);
			label.setVisible(true);
		}
		
	}

}
