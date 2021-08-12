package com.hk.app;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		
		// 두자리의 숫자를 랜덤하게 생성하여 배열 num에 저장하고(자리 숫자가 중복되지 않게)
		// 키보드를 통해 두 자리의 숫자를 입력받는다(자리 숫자가 중복되거나 두 자리가 아니면 다시 입력받음.)
		// 랜덤한 숫자와 입력한 숫자를 비교하여 랜덤한 숫자가 입력한 숫자보다 작은지 큰지를 출력하고 숫자가 같아질 때까지 반복한다.
		// 숫자가 같아지면 입력횟수와 맞춘 숫자를 출력하시오.
		
		int[] num = new int[2];
		//1~9까지 값이 랜덤하게 들어가는데 중복되지 않게.
		// 첫번째 1이면 다음것은 1이 되면 안된다.
		// 2,5 = 25 결정.
		
		// 키보드를 숫자를 입력.
		// 15 입력하면
		// 랜덤값은 더 큽니다.
		
		// 계속 입력해서 같아지면 프로그램 종료됨.
		
		
		for (int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*10);
			if(num[0]==0) {
				i--;
			}else if(num[0]==num[1]) {
				i--;
			}
		} int rand = num[0]*10 + num[1];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 자리 숫자를 입력하시오.");
		int[] input = new int[1];
		input[0] = sc.nextInt();
		
		for(int j=0; j<1; j++) {
			for (int i=0; i<1; i++) {
				if(input[0]<10 || input[0]/10==input[0]%10)  {
					System.out.println("두 자리 숫자(중복되지 않은 수)로 입력하시오.");
					input[i] = sc.nextInt();				
					i--;
				}
			}
			if (input[0]>rand) {
				System.out.println("랜덤한 숫자보다 큽니다. 두 자리 숫자를 다시 입력하시오.");
				input[0] = sc.nextInt();
				j--;
			}else if (input[0]<rand) {
				System.out.println("랜덤한 숫자보다 작습니다. 두 자리 숫자를 다시 입력하시오.");
				input[0] = sc.nextInt();
				j--;
			}else {
				System.out.println("랜덤한 숫자("+rand+")를 맞췄습니다.");
			}
		}
		
	}

}
