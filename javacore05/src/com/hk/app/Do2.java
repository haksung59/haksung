package com.hk.app;

public class Do2 {

	public static void main(String[] args) {
		// 랜덤값(1-10) 중에서 발생해서 만약 홀수이면 다시 발생하시오.
		// 짝수만 나오도록
		
		//int rand = (int)(Math.random()*10)+1;
		
		
		//while(rand%2 ==1) {	// 2로 나눈 나머지가 1이면 홀수
		//	rand = (int)(Math.random()*10)+1;
		//}
		//한번은 무조건 실행한다면
		
		int rand;
		do {
			rand = (int)(Math.random()*10)+1;
		}while(rand%2==1);
		
		
		System.out.println(rand);

	}

}
