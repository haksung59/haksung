package com.hk.app;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LayoutGrid1 extends JFrame{
	
	public LayoutGrid1() {
		
		setTitle("윈도우 제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		
		GridLayout grid = new GridLayout(4,2); //4행 2열
		grid.setVgap(10);
		setLayout(grid);
		
		JLabel name = new JLabel("이름:");
		JLabel major = new JLabel("학과:");
		JLabel id = new JLabel("학번:");
		JLabel subject = new JLabel("과목:");
		
		JTextField txtName = new JTextField("");
		JTextField txtMajor = new JTextField("");
		JTextField txtId = new JTextField("");
		JTextField txtSubject = new JTextField("");
		
		add(name); add(txtName);
		add(major); add(txtMajor);
		add(id); add(txtId);
		add(subject); add(txtSubject);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		LayoutGrid1 grid1 = new LayoutGrid1();
	}

}
