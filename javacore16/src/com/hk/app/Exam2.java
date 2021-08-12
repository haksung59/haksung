package com.hk.app;

import java.awt.*;

import javax.swing.*;

public class Exam2 extends JFrame {
	
	public Exam2() {
		setTitle("윈도우 제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,200);
		
		Container Pane = getContentPane();
		Pane.setLayout(new BorderLayout(10,10));
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		
		Pane.add(btn1, BorderLayout.NORTH);
		Pane.add(btn2, BorderLayout.WEST);
		Pane.add(btn3, BorderLayout.CENTER);
		Pane.add(btn4, BorderLayout.EAST);
		Pane.add(btn5, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Exam2 aaa = new Exam2();
	}
}
