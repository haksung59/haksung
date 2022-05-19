package com.hk.app;

import javax.swing.JFrame;

public class ContSample extends JFrame {
	
	public ContSample() {
		
		setTitle("윈도우제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ContLabel1 control = new ContLabel1();
	}

}
