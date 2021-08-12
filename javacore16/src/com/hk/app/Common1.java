package com.hk.app;

import java.awt.*;
import javax.swing.*;

public class Common1 extends JFrame {
	
	public Common1() {
		setTitle("윈도우 제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,200);
		setLayout(new FlowLayout());
		
		Container mainPane = getContentPane();
		
		JButton btnPos = new JButton("위치 크기 정보");
		mainPane.add(btnPos);
		
		JButton btnShape = new JButton("모양 정보");
		btnShape.setForeground(Color.MAGENTA);
		btnShape.setBackground(Color.YELLOW);
		btnShape.setFont(new Font("고딕체", Font.ITALIC,20));
		mainPane.add(btnShape);
		
		JButton btnEnable = new JButton("활성화 버튼");
		btnEnable.setEnabled(false);
		mainPane.add(btnEnable);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Common1 cm = new Common1();
	}

}
