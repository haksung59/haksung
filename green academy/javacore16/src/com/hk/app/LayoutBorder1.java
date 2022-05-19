package com.hk.app;

import java.awt.*;

import javax.swing.*;

public class LayoutBorder1 extends JFrame {
	
	public LayoutBorder1() {
		
		setTitle("윈도우 제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container Pane = getContentPane();
		Pane.setLayout(new BorderLayout());
		
		JButton btn1 = new JButton("center");
		JButton btn2 = new JButton("top");
		JButton btn3 = new JButton("bottom");
		JButton btn4 = new JButton("left");
		JButton btn5 = new JButton("right");
		
		Pane.add(btn1, BorderLayout.CENTER);
		Pane.add(btn2, BorderLayout.NORTH);
		Pane.add(btn3, BorderLayout.SOUTH);
		Pane.add(btn4, BorderLayout.WEST);
		Pane.add(btn5, BorderLayout.EAST);
		
		setSize(300,300);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		LayoutBorder1 b1 = new LayoutBorder1();
	}

}
