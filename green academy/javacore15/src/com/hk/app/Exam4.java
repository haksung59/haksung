package com.hk.app;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exam4 {

	public static void main(String[] args) {
		
		List num = new LinkedList();
		
		//1부터 100까지의 랜덤하게 값을 저장한다 (20개까지)
		
		for(int i=0; i<20; i++) {
			num.add((int)(Math.random()*100)+1);
		}
		
		//반복자 Iterator 사용해서 짝수만 찾아서 출력하시오.
		int[] number = new int[20];
		int i=0;
		Iterator itr = num.iterator();
		while(itr.hasNext()) {
			number[i] = (int)itr.next();
			i++;
		}
		int sum = 0;
		int n=1;
		for(int j=0; j<number.length; j++) {
			if(number[j]%2 == 0) {
				System.out.println(n+"번째 짝수 : "+number[j]);
				sum += number[j];
				n++;
			}
		}
		// 짝수의 합을 출력하시오.
		System.out.println("짝수의 합 : "+sum);
		

	}

}
