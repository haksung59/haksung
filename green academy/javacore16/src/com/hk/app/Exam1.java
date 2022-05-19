package com.hk.app;

import java.awt.*;

import javax.swing.*;

public class Exam1 extends JFrame {
	
	public Exam1() {
		setTitle("윈도우 제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,200);
	
		
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("버튼 1");
		JButton btn2 = new JButton("버튼 2");
		JButton btn3 = new JButton("버튼 3");
		
		contentPane.add(btn1);
		contentPane.add(btn2);
		contentPane.add(btn3);
		
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		Exam1 ff = new Exam1();
	}


}
