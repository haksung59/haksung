package com.hk.app;

import java.util.Scanner;

public class SwitchIf {

	public static void main(String[] args) {
		// score를 입력하고
		// 100~90 grade 학점 A 라고 출력
		// 89~80 grade 학점 B 라고 출력
		// 79~70 grade 학점 C 라고 출력
		// 기타는 D
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학점출력기-점수를 입력하시오.");
		int input = sc.nextInt();
		
		String grade = "";
		switch (input/10) { //input 100~0
		
		case 10:
		case 9: /* 100~90 */
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
		default:
			grade = "D";
			break;
		}
		System.out.println("당신의 학점은:"+grade);
		
		// switch문을 if문으로 바꾸시오
		int temp = input/10;
		if(input/10 == 10 || input/10 == 9) {
			grade="A";
		}else if(temp == 8) {
			grade="B";
		}else if(temp == 7) {
			grade="C";
		}else {
			grade="D";
		}
			System.out.println("(if)당신의 학점은:"+grade);

	}

}
