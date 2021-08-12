package com.hk.java;

public class exam4 {

	public static void main(String[] args) {
		
		printText();
		

	}

	public static void printText() {
		String a = "Java Function";
		printText(a,5);
	}
	
	public static void printText(String txt, int N) {
		for(int i=0; i<N; i++) {
			System.out.println(txt);
		}
	}
}
