package com.hk.app;

import javax.swing.*;

public class MyFrame1 extends JFrame{

	//생성자를 통해서 Frame 설정
	public MyFrame1() {
		setTitle("윈도우 제목");
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame1 mf = new MyFrame1();
	}
}
