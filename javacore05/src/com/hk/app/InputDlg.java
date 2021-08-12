package com.hk.app;

import javax.swing.JOptionPane;

public class InputDlg {

	public static void main(String[] args) {
		
		// answer 에 임의의 숫자 저장(1-100)
		
		int answer = (int)(Math.random()*100)+1;
		
		// 
		String message = "(1~100)까지의 임의의 숫자를 입력하시오:";
		String number = JOptionPane.showInputDialog(message);
		int input = Integer.valueOf(number); // 문자열->정수로 변경
		
		System.out.println("랜덤한 값은: "+answer);
		System.out.println("입력한 값은: "+input);

	}

}
