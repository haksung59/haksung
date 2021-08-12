package com.hk.app;

import javax.swing.JOptionPane;

public class exam8 {

	public static void main(String[] args) {
		// ShowInputDialog() 행과 열을 입력받는다.
		// ★을 이용하여 사각형 출력
		//예를들어 2,2 입력하면
		//★★
		//★★
		
		String strR = JOptionPane.showInputDialog("행(3-10):");
		String strC = JOptionPane.showInputDialog("열(3-10):");
		int RR = Integer.valueOf(strR);
		int CC = Integer.valueOf(strC);
		
		for (int r=1; r<=RR; r++) {
			
			for(int c=1; c<=CC; c++) {
				
				System.out.print("★");
			}
			System.out.println();
		}
		
	}

}
