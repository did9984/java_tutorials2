package panels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImageIcon icon =new ImageIcon("C:\\Users\\82108\\git\\java_tutorials2\\Object\\src\\panels\\images.png");
		
		
		JLabel label =new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(0, 0, 75, 75);
		
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(0,0,250,250);
		redpanel.setLayout(new BorderLayout());
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(250,0,250,250);
		bluepanel.setLayout(null);
		
		JPanel greenpanel = new JPanel();
		greenpanel.setBackground(Color.green);
		greenpanel.setBounds(0,250,500,250);
		greenpanel.setLayout(new BorderLayout());
		
		JFrame fr =new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(null);
		fr.setSize(750,750);
		fr.setVisible(true);
		bluepanel.add(label);
		fr.add(redpanel);
		fr.add(bluepanel);
		fr.add(greenpanel);
	}

}
