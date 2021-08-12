package com.hk.app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutEx1 extends JFrame implements ActionListener{
	
	JButton btn1 = null;
	JButton btn2 = null;
	JButton btn3 = null;
	JButton btn4 = null;
	CardLayout layout = null;
	JPanel card = null;
	
	public CardLayoutEx1() {
		setTitle("윈도우제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		
		Container mainpane = getContentPane();
		
		//카드레이아웃
		CardLayout layout = new CardLayout();	//카드를 변경하기 위해서
		JPanel card = new JPanel();
		card.setLayout(layout);
		Color[] color = {Color.white, Color.yellow, Color.blue, Color.pink};
		for(int i=0; i<4; i++) {
			JButton bt = new JButton();
			bt.setText("카드번호는 "+i+"입니다.");
			bt.setBackground(color[i]);
			card.add(bt);
		}
		
		//버튼판넬
		JPanel jp = new JPanel(new GridLayout(1, 4, 0, 0));
		JButton btn1 = new JButton("처음");
		JButton btn2 = new JButton("이전");
		JButton btn3 = new JButton("다음");
		JButton btn4 = new JButton("마지막");
		jp.add(btn1);jp.add(btn2);jp.add(btn3);jp.add(btn4);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		mainpane.add(jp, BorderLayout.SOUTH);
		mainpane.add(card, BorderLayout.CENTER);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		
		CardLayoutEx1 main = new CardLayoutEx1();

	}
	//버튼이 클릭되면 이벤트 처리하는 함수
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton temp = (JButton)e.getSource();
		if(temp == btn1) {
			JOptionPane.showMessageDialog(null, "test");
		}else if(temp == btn2) {
			layout.previous(card);
		}else if(temp == btn3) {
			layout.next(card);
		}else if(temp == btn4) {
			JOptionPane.showMessageDialog(null, "test");
		}
		
	}
	
}
