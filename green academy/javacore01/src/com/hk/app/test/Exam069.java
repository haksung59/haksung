package com.hk.app.test;

import java.util.ArrayList;
import java.util.List;

public class Exam069 {

	public static void main(String[] args) {
		// ArrayList를 배열로 변환하여 출력하시오.
		// ArrayList에 담긴 'A' 'C' 'D' 'H' 'Z' ==> String[] result 에 담아서 출력하시오.
		
		List alpha = new ArrayList();
		
		alpha.add("A");	alpha.add("B");	alpha.add("C");
		alpha.add("D");	alpha.add("E");	alpha.add("F");
		alpha.add("G");	alpha.add("H");	alpha.add("I");
		alpha.add("J");	alpha.add("K");	alpha.add("L");
		alpha.add("M");	alpha.add("N");	alpha.add("O");
		alpha.add("P");	alpha.add("Q");	alpha.add("R");
		alpha.add("S");	alpha.add("T");	alpha.add("U");
		alpha.add("V");	alpha.add("W");	alpha.add("X");
		alpha.add("Y");	alpha.add("Z");
		
		String[] result = new String[5];
		int n = 0;
		
		for(int i=0; i<alpha.size(); i++) {
			if(alpha.get(i).equals("A") || alpha.get(i).equals("C") ||
					alpha.get(i).equals("D") || alpha.get(i).equals("H")
					|| alpha.get(i).equals("Z")) {
				
				result[n] = (String)alpha.get(i);
				n++;
			}
		}
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
		
		

	}

}
