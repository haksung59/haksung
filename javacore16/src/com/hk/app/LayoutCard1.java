package com.hk.app;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class LayoutCard1 extends JFrame {
	
	public LayoutCard1() {
		
		setTitle("윈도우 제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setLayout(new BorderLayout());
		
		CardLayout cardlayout = new CardLayout();
		JPanel cardPanel = new JPanel(cardlayout);
		
		//카드레이아웃에 들어갈 판넬 정의
		JPanel card1 = new JPanel();
		card1.setBackground(Color.green);
		JPanel card2 = new JPanel();
		card2.setBackground(Color.pink);
		
		// cardPanel에 추가
		cardPanel.add(card1,"GreenCard");
		cardPanel.add(card2,"PinkCard");
		
		//하단에 버튼컨트롤 판넬 추가
		JPanel btnPanel = new JPanel();	//기본 레이아웃 flow layout
		JButton btn1 = new JButton("초록색");
		JButton btn2 = new JButton("분홍색");
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		
		//버튼1의 이벤트
		btn1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cardlayout.show(cardPanel, "GreenCard");
			}
		});
		//버튼2의 이벤트
		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cardlayout.show(cardPanel, "PinkCard");
			}
		});
		
		//프레임 - 보더 레이아웃
		add(cardPanel, BorderLayout.CENTER);
		add(btnPanel, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		LayoutCard1 card = new LayoutCard1();
		
	}
}
