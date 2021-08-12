package com.hk.app;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class exam9 {

	public static void main(String[] args) {
		// 9번
		// 구구단의 단을 입력하면
		// 2단 ~ 입력한 단까지 출력
		// 3을 입력하면
		
		//2*1=2		3*1=3
		//2*2=4		3*2=6
		//...		...
		//2*9=18	3*9=27
		
		String str = JOptionPane.showInputDialog("구구단을 입력하시오");
		int dan = Integer.valueOf(str);
		
		for(int r=1; r<=9; r++) {
			for(int c=2; c<=dan; c++) {
				System.out.print(c+"*"+r+"="+(c*r) + "\t");
			}
			System.out.println();
		}
	}

}
