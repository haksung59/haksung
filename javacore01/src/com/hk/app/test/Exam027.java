package com.hk.app.test;

import java.util.Scanner;

public class Exam027 {

	public static void main(String[] args) {
		
		// 암스트롱넘버
		// 숫자가 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
		// 임의의 숫자가 암스트롱넘버인지 체크하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오.");
		int input = sc.nextInt();
		
		int N = 1;
		for(int i=1; i<10000; i++) {
			N *= 10;
			if(input/N==0) {
				N = i;
				break;
			}
		}
		int[] num = new int[10000];
				
		for(int j=1,i=0; i<N; i++) {
			num[i]= input/j-input/(j*10)*10;
			j*=10;
		}
		int ams = 0;
		for(int i=0; i<N; i++) {
			ams += num[i]*num[i]*num[i];
		}
		if(input == ams) {
			System.out.println(input+"은(는) 암스트롱넘버입니다.");
		}else {
			System.out.println(input+"은(는) 암스트롱넘버가 아닙니다.");
		}
		
		

	}

}
