package com.hk.app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.hk.app.ContCheck1.MyActionListener;

public class Exam5 extends JFrame {

	JButton next = new JButton("Next");
	JButton previous = new JButton("Previous");
	JButton first = new JButton("First");
	JButton last = new JButton("Last");
	
	JPanel[] panel = {
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel()
	};
	int i = 0;
	
	//생성자
	public Exam5() {
		
		setTitle("윈도우제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,250);
		
		Container mainPane = getContentPane();
		
		GridLayout grid = new GridLayout(4,1);
		JPanel btnpanel = new JPanel(grid);
		
		btnpanel.add(next);
		btnpanel.add(previous);
		btnpanel.add(first);
		btnpanel.add(last);
		mainPane.add(btnpanel, BorderLayout.WEST);
		
		CardLayout cardlayout = new CardLayout();
		JPanel cardPanel = new JPanel(cardlayout);
		
		panel[0].setBackground(Color.yellow);
		panel[1].setBackground(Color.red);
		panel[2].setBackground(Color.green);
		panel[3].setBackground(Color.black);
		
		cardPanel.add(panel[0],"YellowCard");
		cardPanel.add(panel[1],"RedCard");
		cardPanel.add(panel[2],"GreenCard");
		cardPanel.add(panel[3],"BlackCard");
		
		add(cardPanel, BorderLayout.CENTER);
		
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				if(i>3) {
					i=0;
				}
				if(i==0) {
					cardlayout.show(cardPanel, "YellowCard");
				}else if(i==1) {
					cardlayout.show(cardPanel, "RedCard");
				}else if(i==2) {
					cardlayout.show(cardPanel, "GreenCard");
				}else if(i==3) {
					cardlayout.show(cardPanel, "BlackCard");
				}
				
			}
		});
		
		previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i--;
				if(i<0) {
					i=3;
				}
				if(i==0) {
					cardlayout.show(cardPanel, "YellowCard");
				}else if(i==1) {
					cardlayout.show(cardPanel, "RedCard");
				}else if(i==2) {
					cardlayout.show(cardPanel, "GreenCard");
				}else if(i==3) {
					cardlayout.show(cardPanel, "BlackCard");
				}
			}
		});
		
		last.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				i=3;
				cardlayout.show(cardPanel, "BlackCard");
			}
		});
		first.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				i=0;
				cardlayout.show(cardPanel, "YellowCard");
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Exam5 control = new Exam5();
	}
	//UI구성
	
	// 1-프레임 BorderLayout 사용
	// 2-왼쪽에 Jpanel - GridLayout 사용(버튼을 4개 올리고)
	// 3-가운데 Jpanel - CardLayout 사용(판넬을 4개 올립니다)

}
