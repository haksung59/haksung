package com.hk.app.test;

import javax.swing.JOptionPane;

public class Exam013 {

	public static void main(String[] args) {
		
		// 문자를 입력하여 알파벳인지 아닌지 구분하시오.
		
		String message1 = "문자를 입력하시오.";
		String input = JOptionPane.showInputDialog(message1);
		char word = input.charAt(0);
		
		if (word=='a'||word=='b'||word=='c'||word=='d'||word=='e'||word=='f'||word=='g'||word=='h'||word=='i'||word=='j'||word=='k'||word=='l'||
			word=='m'||word=='n'||word=='o'||word=='p'||word=='q'||word=='r'||word=='s'||word=='t'||word=='u'||word=='v'||word=='w'||word=='x'||
			word=='y'||word=='z') {
			System.out.println("입력한 문자는 '"+word+"' 알파벳 소문자입니다.");
		}else if (word=='A'||word=='B'||word=='C'||word=='D'||word=='E'||word=='F'||word=='G'||word=='H'||word=='I'||word=='J'||word=='K'||word=='L'||
			word=='M'||word=='N'||word=='O'||word=='P'||word=='Q'||word=='R'||word=='S'||word=='T'||word=='U'||word=='V'||word=='W'||word=='X'||
			word=='Y'||word=='Z') {
			System.out.println("입력한 문자는 '"+word+"' 알파벳 대문자입니다.");
		}else {
			System.out.println("입력한 문자는 '"+word+"' 알파벳이 아닙니다.");
		}
		
	}

}
