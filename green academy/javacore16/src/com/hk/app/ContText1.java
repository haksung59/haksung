package com.hk.app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ContText1 extends JFrame {
	
	public ContText1() {
		
		setTitle("윈도우제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,250);
		
		Container mainPane = getContentPane();
		mainPane.setLayout(new BorderLayout());	//프레임은 기본 보더레이아웃.
		
		JPanel mypanel = new JPanel();
		JTextField text = new JTextField(20);
		JButton btn = new JButton("추가");
		JTextArea tarea = new JTextArea("", 7, 20);
		mypanel.add(text);
		mypanel.add(btn);
		mypanel.add(new JScrollPane(tarea));
		
		mainPane.add(mypanel, BorderLayout.CENTER);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String input = text.getText() + "\n";	//getText() , setText()
				
				tarea.append(input);					// setText(), append()
				
			}
			
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ContText1 control = new ContText1();
	}

}
