package com.hk.app;

public class Exam2 {

	public static void main(String[] args) {
		
		//1부터 10까지를 저장할 정수형 배열 no 을 만들어서 대입하고 각각을 서로 곱한 값을 출력하라.
		
		int[] no = new int[10];
		int result = 1;
		for(int i=0; i<no.length; i++) {
			
			no[i] = (int)(Math.random()*10)+1;
			result *= no[i];
			System.out.print(no[i]+" ");
		}System.out.println(result);

	}

}
