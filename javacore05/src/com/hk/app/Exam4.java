package com.hk.app;

import javax.swing.JOptionPane;

public class Exam4 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("구구단의 단을 입력하시오(2~9)");
		int input = Integer.valueOf(str);
		
		for(int i=1; i<10; i++)	{
			
			System.out.println(input + "*" + i + "=" + (input*i));
		}

	}

}
