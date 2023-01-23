package label;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {

		ImageIcon image = new ImageIcon("C:\\Users\\82108\\git\\java_tutorials2\\Object\\src\\label\\images.png");
		Border bor = BorderFactory.createLineBorder(Color.green, 3); // border 테두리 를 조정

		JLabel la = new JLabel(); // 라벨 생성 코드
		la.setText("Bro,code"); // 라벨 텍스트 설정
		la.setIcon(image); // 이미지 설정
		la.setHorizontalTextPosition(JLabel.CENTER); // 텍스트 위치 설정 이미지 아이콘 기준 왼쪽 센터 오른쪽
		la.setVerticalTextPosition(JLabel.TOP); // 텍스트 위치 조정 이미지 아이콘 기준 top center bottom
		la.setForeground(new Color(0x00FF00)); // set font color of text
		la.setFont(new Font("MV Boli", Font.PLAIN, 20)); // 폰트 사이즈, 폰트 변경
		la.setIconTextGap(-25); // 이미지 와의 거리
		la.setBackground(Color.black); // 배경 색깔 변경
		la.setOpaque(true);// display 배경 색깔
		la.setBorder(bor);
		la.setVerticalAlignment(JLabel.CENTER); // 아이콘 텍스트 위치조정
		la.setHorizontalAlignment(JLabel.CENTER); // 아이콘 텍스트 위치조정
		la.setBounds(100, 100, 250, 250); // 전체크기의 x,y,height,width를 조정

		JFrame fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 닫기생성
		fr.setSize(500, 500);// 사이즈조정
		fr.setLayout(null); // 레이아웃 null 로 수정
		fr.setVisible(true); // 화면
		fr.add(la);
		fr.pack(); // label 이 최소화로 나옴
	}
}
