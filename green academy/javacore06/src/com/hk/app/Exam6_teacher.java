package com.hk.app;

import java.util.Scanner;

public class Exam6_teacher {

	public static void main(String[] args) {
		
		// 두자리의 숫자를 랜덤하게 생성하여 배열 num에 저장하고(자리 숫자가 중복되지 않게)
		// 키보드를 통해 두 자리의 숫자를 입력받는다(자리 숫자가 중복되거나 두 자리가 아니면 다시 입력받음.)
		// 랜덤한 숫자와 입력한 숫자를 비교하여 랜덤한 숫자가 입력한 숫자보다 작은지 큰지를 출력하고 숫자가 같아질 때까지 반복한다.
		// 숫자가 같아지면 입력횟수와 맞춘 숫자를 출력하시오.

		//1~9까지 값이 랜덤하게 들어가는데 중복되지 않게.
		// 첫번째 1이면 다음것은 1이 되면 안된다.
		// 2,5 = 25 결정.
		// 키보드를 숫자를 입력.
		// 15 입력하면
		// 랜덤값은 더 큽니다.
		
		// 계속 입력해서 같아지면 프로그램 종료됨.
				
		int[] num = new int[2];
		do { //같은지 비교하려면 한번은 값을 발생해야 하기 때문.
			num[0] = (int)(Math.random()*9)+1;
			num[1] = (int)(Math.random()*10);
		}while(num[0]==num[1]);
		
		//2번
		int rand = num[0]*10 + num[1];
		//System.out.println(rand);
		System.out.println("임의의 두자리 숫자를 발생했습니다.");
		System.out.println("자리수는 중복되지 않도록");
		
		//3번
		Scanner reader = new Scanner(System.in);
		int input = 0;
		do {	
			do {
			System.out.print("임의의 숫자를 맞추시오(12-98):");
			input = reader.nextInt();
			}while(input<12||input>=99);
			
			//4번
			if(rand>input) {
				System.out.println("더 큰 수를 입력하시오.");
			}else if(rand<input){
				System.out.println("더 작은 수를 입력하시오.");
			}else {
				System.out.println("임의의 숫자"+rand+"를 맞췄습니다.");
			}
		}while(rand!=input);
	
	}

}
