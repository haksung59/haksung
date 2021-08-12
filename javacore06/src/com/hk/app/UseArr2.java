package com.hk.app;

public class UseArr2 {

	public static void main(String[] args) {
		
		// 영어점수 배열 en 인덱스 5개인 배열을 선언
		
		// 각각의 점수에 대해서 학점(90-A 80-B 70-C 나머지-D)
		// 점수-학점을 출력하시오.
		
		int[] en = {94,83,46,76,56};
		
		char[] grade = {'A','B','C','D'};
		
		
		for (int i =0; i<en.length; i++) {
			if (en[i]>=90) {
				System.out.println("당신의 점수는 '"+en[i]+"'점. "+ grade[0]+"입니다.");
			}else if(en[i]>=80) {
				System.out.println("당신의 점수는 '"+en[i]+"'점. "+ grade[1]+"입니다.");
			}else if (en[i]>=70) {
				System.out.println("당신의 점수는 '"+en[i]+"'점. "+ grade[2]+"입니다.");
			}else {
				System.out.println("당신의 점수는 '"+en[i]+"'점. "+ grade[3]+"입니다.");
			}
		}
		

	}

}
