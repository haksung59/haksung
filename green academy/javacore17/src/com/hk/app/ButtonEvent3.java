package com.hk.app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonEvent3 extends JFrame{

	// 2-생성자를 통해서 윈도우의 기본 설정
		public ButtonEvent3() {
			
			setTitle("윈도우제목");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new FlowLayout());
			
			JButton btn = new JButton("버튼 클릭 이벤트 예제");
			
			
			// 3번째 방법 - 익명클래스 - 1~2개의 컴포넌트를 연결해 쓸 때 - 간단한 경우
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					
				}
				
			});
			
			add(btn);
			
			setSize(300,100);
			
			setVisible(true);
			
		}
	public static void main(String[] args) {
			
			// 3-메인에서 윈도우 그리기.
			ButtonEvent3 main = new ButtonEvent3();

		}

}
