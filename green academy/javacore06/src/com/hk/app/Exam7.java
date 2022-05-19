package com.hk.app;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		
		// 조편성
		// 카톡으로 학생명을 19명을 올렸는데. (배열 담아서)
		// 1조당 인원수 는? 4 (입력을 받음)
		// -> 19/4 => 5개조를 만듦.
		// 각각 조는 랜덤하게 돌려서 편성하여
		// 1조 : 최한솔 김학성 ...
		// 2조 : 문세훈  최성수 ...
		//
		// 5조 : ....
		
		String[] group = {"김학성","김대현","김지홍","김진우","문세훈",
						  "서민규","송원진","송은빈","안정민","안태영",
						  "이창훈","임승준","장선우","정동섭","최성수",
						  "최영훈","최한솔","한세희","송영록"
						 };
		for(int i=0; i<1000; i++) {
			String temp = group[0];
			int rand = (int)Math.random()*19;
			group[0] = group[rand];
			group[rand] = temp;
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("한 조당 인원수를 적으시오.");
		int num = sc.nextInt();
		int length = 0;
		if (group.length%num>0) {
			length = group.length/num+1;
		}else {
			length = group.length/num;
			};
		for(int i=0; i<length; i++) {
			System.out.print((i+1)+"조 : ");
			if (i==length-1) {
				for(int j=(num*i); j<group.length; j++) {
					System.out.print(group[j]+" ");
				}
			}else for(int j=(num*i); j<(num*i)+num; j++) {
					System.out.print(group[j]+" ");
			}
			System.out.println();
			
		}
		
	}

}
