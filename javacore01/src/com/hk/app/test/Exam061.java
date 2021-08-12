package com.hk.app.test;

import java.util.Scanner;

public class Exam061 {

	public static void main(String[] args) {
		
		int[] nums = {9,5,6,7,3};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
		int input = sc.nextInt();
		
		for(int i=0; i<nums.length; i++) {
			if(input==nums[i]) {
				System.out.println("배열에 입력한 값("+input+")이 있습니다.");
			}
			if(i==4) {
				if(input!=nums[0] && input!=nums[1] && input!=nums[2] && input!=nums[3] && input!=nums[4]) {
					System.out.println("배열에 입력한 값("+input+")이 없습니다.");
				}
			}
		}
		
	}

}
