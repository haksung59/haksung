package com.hk.app.test;

public class Exam054 {

	public static void main(String[] args) {
		
		//알파벳으로 삼각형 출력하시오.
		//A			0-0
		//BC		12-2
		//DEF		345-5
		//GHIJ		6789-9
		//KLMNO		1011121314-14
		
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] each = alpha.split("");
		
		int j=2;
		int k=2;
		for(int i=0; i<each.length; i++) {
			System.out.print(each[i]);
			if(i==0) {
				System.out.println();
			}else if(i==j) {
				System.out.println();
				k=2+(k-1);
				j += k;
			}
		}
		

	}

}
