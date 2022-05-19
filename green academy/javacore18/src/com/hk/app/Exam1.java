package com.hk.app;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Exam1 {

	public static void main(String[] args) {
		
		// Scanner 사용해서 양의 정수를 계속 입력을 받고
		// 만일 -1 입력되면 입력을 종료하고 입력받은 정수를 벡터 저장을 한다.
		// 그리고 가장 큰 수를 출력하시오.
		
		//Vector<Integer> vec = new Vector<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int size = 0;
		int max = 0;
		Vector<Integer> vec = new Vector<Integer>();
		
		while(true) {
			System.out.print("양의 정수를 입력하시오.");
			int input = sc.nextInt();
			
			if(input==-1) {
				System.out.println(max);
				break;
			}
			
			vec.add(input);
			size = vec.size();
			
			for(int i=0; i<size; i++) {
				if(max<vec.get(i)){
					max=vec.get(i);
				}
			}
		}
		
		

	}

}
