package com.hk.app;

import java.awt.*;
import javax.swing.*;

public class Exam3 extends JFrame {
	//스윙을 사용하여 계산기 폼 작성.
		//전체 보더레이아웃, 상단 인풋.
		//숫자 그리드.
	public Exam3() {
		
		setTitle("EXAM3-계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		
		Container mainPane = getContentPane();
		mainPane.setLayout(new BorderLayout());
		
		JTextField result = new JTextField("");
		mainPane.add(result,BorderLayout.NORTH);
		//버튼 16개 생성해서 추가.
		GridLayout grid = new GridLayout(4,4);
		JPanel btnPanel = new JPanel(grid);
		
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btnD = new JButton("/");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btnM = new JButton("*");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btnMinus = new JButton("-");
		JButton btnC = new JButton("C");
		JButton btn0 = new JButton("0");
		JButton btnE = new JButton("=");
		JButton btnP = new JButton("+");
		
		btnPanel.add(btn7);
		btnPanel.add(btn8);
		btnPanel.add(btn9);
		btnPanel.add(btnD);
		btnPanel.add(btn4);
		btnPanel.add(btn5);
		btnPanel.add(btn6);
		btnPanel.add(btnM);
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		btnPanel.add(btn3);
		btnPanel.add(btnMinus);
		btnPanel.add(btnC);
		btnPanel.add(btn0);
		btnPanel.add(btnE);
		btnPanel.add(btnP);
		
		
		add(btnPanel, BorderLayout.CENTER);
		setVisible(true);
	} 
	
	public static void main(String[] args) {
		Exam3 ex3 = new Exam3();
	}

}
