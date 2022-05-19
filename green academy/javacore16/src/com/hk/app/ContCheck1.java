package com.hk.app;

import java.awt.*;			//윈도우 컴포넌트
import java.awt.event.*;	//이벤트 처리
import javax.swing.*;

public class ContCheck1 extends JFrame {
	
	JCheckBox chkApp = new JCheckBox("사과");	//,true하면 체크된상태
	JCheckBox chkOrange = new JCheckBox("오렌지");
	JCheckBox chkCherry = new JCheckBox("체리");
	JLabel result = new JLabel("현재 선택된 과일들의 합은 0원");
	int sum = 0;
	
	ButtonGroup btnGroup = new ButtonGroup(); // 라디오 버튼을 그루핑
	JRadioButton pizza = new JRadioButton("피자");
	JRadioButton spa = new JRadioButton("스파게티");
	JRadioButton riz = new JRadioButton("리조또");
	JLabel imgLabel = new JLabel();
	
	ImageIcon[] image = {
			new ImageIcon("images/spainfood.jpg"),
			new ImageIcon("images/pizza.jpg"),
			new ImageIcon("images/spa.jpg"),
			new ImageIcon("images/riz.jpg")
	};

	
	public ContCheck1() {	//생성자
		
		setTitle("윈도우제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,400);
		
		Container mainPane = getContentPane();
		mainPane.setLayout(new FlowLayout());
		
		JLabel title = new JLabel("사과: 2000원, 오렌지: 1000원, 체리: 1500원");

		btnGroup.add(pizza);btnGroup.add(spa);btnGroup.add(riz);
		imgLabel.setIcon(image[0]);
		
		//이벤트연결
		chkApp.addItemListener(new MyItemListener());
		chkOrange.addItemListener(new MyItemListener());
		chkCherry.addItemListener(new MyItemListener());
		
		mainPane.add(title);
		mainPane.add(chkApp);
		mainPane.add(chkOrange);
		mainPane.add(chkCherry);
		mainPane.add(result);
		
		mainPane.add(pizza);
		mainPane.add(spa);
		mainPane.add(riz);
		mainPane.add(imgLabel);
		pizza.addActionListener(new MyActionListener());
		spa.addActionListener(new MyActionListener());
		riz.addActionListener(new MyActionListener());
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ContCheck1 control = new ContCheck1();
	}
	
	//내부클래스
	public class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String str = e.getActionCommand();  // 클릭된 컴포넌트의 이름
			if(str.equals(pizza.getText())) {
				imgLabel.setIcon(image[1]);
			}else if(str.equals(spa.getText())){
				imgLabel.setIcon(image[2]);
			}else if(str.equals(riz.getText())) {
				imgLabel.setIcon(image[3]);
			}else {
				imgLabel.setIcon(image[0]);
			}
			
		}
		
	}
	
	//내부클래스
	public class MyItemListener implements ItemListener {	//인터페이스

		@Override
		public void itemStateChanged(ItemEvent e) { // 해당 체크박스를 클릭하면 이벤트정보
			// 체크여부 추가
			int selected = 1;
			if(e.getStateChange() == ItemEvent.SELECTED) {
				selected = 1;
			}else {  // deseleted
				selected = -1;
			}
			
			if(e.getItem() == chkApp) {
				//계산
				sum+=2000*selected;
			}else if(e.getItem() == chkOrange) {
				//계산
				sum+=1000*selected;
			}else { // 마지막
				sum+=1500*selected;
			}
			
			result.setText("현재 선택된 과일들의 합은 "+sum+"원");
			
		}
		
	}

}