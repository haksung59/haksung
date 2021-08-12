package com.hk.app;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i=0;
		int max=0;	//최대값 저장하는 변수
		while(i<10) {	//비교식
			System.out.print("숫자를 입력하시오.:");
			int input = sc.nextInt();
			i++;	//증감식
			
			if(i==1) {		//i==1 의미 = 첫번째 입력인 경우
				max = input;	// 첫번째 입력한 값이 맥스값
			}else {
				if(input > max) 
					max = input;
		}
		
			}System.out.println(max);
		

	}

}
