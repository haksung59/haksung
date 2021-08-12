package com.hk.app;

import java.awt.*;

import javax.swing.*;

public class FrameComp1 extends JFrame{
	
	public FrameComp1() {
		setTitle("윈도우 제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//윈도우 종료
		setSize(350,200);
		
		// 컴포넌트 넣기
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.green);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
		
		// 버튼 정의
		JButton btn_ok = new JButton("OK");
		JButton btn_cancel= new JButton("CANCEL");
		
		contentPane.add(btn_ok);
		contentPane.add(btn_cancel);
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		FrameComp1 fc1 = new FrameComp1();
	}

}
