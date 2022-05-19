package com.hk.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		int num = 0;
		while(true) {
			try {
				
				System.out.print("숫자를 입력하시오.");
				num = reader.nextInt();		// 엔터칠 때 앞에 까지만 입력
				// 숫자가 아닌 문자가 들어오면 예외처리 -> catch
				// 입력한 값은 숫자가 아닙니다 처리를 하시오.
				System.out.println("입력한 숫자 : " + num);
				break;
			}catch(InputMismatchException e) {
				reader.next();		// 공백까지만 입력 -> 엔터값을 제거해줌.
				System.out.println("입력한 값은 숫자가 아닙니다.");
			}
		}
	}

}
