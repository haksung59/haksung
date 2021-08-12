package com.hk.app;

import java.awt.*;
import javax.swing.*;

public class ContButton1 extends JFrame {
	
	public ContButton1() {
		
		setTitle("윈도우제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		
		Container mainPane = getContentPane();
		mainPane.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("순수한 글자버튼");
		mainPane.add(btn1);
		
		ImageIcon imgBtn = new ImageIcon("images/maso.jpg");
		JButton btn2 = new JButton("글자+이미지버튼",imgBtn);
		mainPane.add(btn2);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ContButton1 control = new ContButton1();
	}


}
