package flowLayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));  //기본값이 center이된다 //TRAILING 오른쪽으로고정// LEADING 왼쪽으로고정 
		// 숫자는 간격조정 width, height
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100,250)); // 패널 크기 조절 
		panel.setBackground(Color.LIGHT_GRAY); // 패널 배경색 
		panel.setLayout(new FlowLayout());
		
		panel.add(new JButton("1")); // 버튼 문자 설정
		panel.add(new JButton("2")); // 버튼 문자 설정
		panel.add(new JButton("3")); // 버튼 문자 설정
		panel.add(new JButton("4")); // 버튼 문자 설정
		panel.add(new JButton("5")); // 버튼 문자 설정
		panel.add(new JButton("6")); // 버튼 문자 설정
		panel.add(new JButton("7")); // 버튼 문자 설정
		panel.add(new JButton("8")); // 버튼 문자 설정
		panel.add(new JButton("9")); // 버튼 문자 설정
		
		frame.add(panel); //프레임에 패널 추가 
		frame.setVisible(true); // 버튼 보이기 
		
	}
}
