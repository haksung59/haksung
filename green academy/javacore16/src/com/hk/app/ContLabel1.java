package com.hk.app;

import java.awt.*;
import javax.swing.*;

public class ContLabel1 extends JFrame {
	
	public ContLabel1() {
		
		setTitle("윈도우제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(425,600);
		
		Container mainPane = getContentPane();
		mainPane.setLayout(new FlowLayout());
		
		JLabel first = new JLabel("사진프로그램입니다.");
		mainPane.add(first);
		
		ImageIcon img = new ImageIcon("images/tree.jpg");
		JLabel second = new JLabel(img);
		mainPane.add(second);
		
		ImageIcon img2 = new ImageIcon("images/maso.jpg");
		JLabel third = new JLabel("클릭하세요",img2, SwingConstants.CENTER);
		mainPane.add(third);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		ContLabel1 control = new ContLabel1();
	}

}
