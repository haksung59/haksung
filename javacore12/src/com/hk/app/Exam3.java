package com.hk.app;

public class Exam3 {

	public static void main(String[] args) {
		
		String strOrg = "자바 프로그래밍 자바 코딩 테스트 게임입니다.";
		String strFind = "바";
		// 바 라는 글자가 몇 개가 있는가?
		
		int N = 0;
		
		String[] word = strOrg.split("");
		for(int i=0; i<word.length; i++) {
			if( word[i].equals(strFind)) {
				N++;
			}	
		}
		System.out.println("'"+strFind+"'의 갯수는 "+N+"개입니다.");

	}

}
