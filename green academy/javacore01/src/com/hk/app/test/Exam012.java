package com.hk.app.test;

import java.util.Scanner;

public class Exam012 {

	public static void main(String[] args) {

		//실수를 입력을 받고
		// 그 실수가 음수인지 , 0인지, 양수인지 체크 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("실수를 입력하시오");
		float rn = sc.nextFloat();
		
		if (rn<0) {
			System.out.println("입력한 숫자 '"+rn+"'은 음수입니다.");
		}else if (rn==0) {
			System.out.println("입력한 숫자 '"+rn+"'은 0입니다.");
		}else {
			System.out.println("입력한 숫자 '"+rn+"'은 양수입니다.");
		}

	}

}
