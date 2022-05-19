package com.hk.app;

public class WhileWhile {

	public static void main(String[] args) {
		
		int r=0;
		while(r<10) {
			int c=0;
			while(c<10) {
				System.out.print("★");
				c++;
			}
			System.out.println();
			r++;
		}
		
		int s=0;
		while(s<10) {
			int d=0;
			while(d<s+1) {
				System.out.print("★");
				d++;
			}
			System.out.println();
			s++;
		}
	}

}
