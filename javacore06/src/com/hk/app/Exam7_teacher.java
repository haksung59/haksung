package com.hk.app;

import java.util.Scanner;

public class Exam7_teacher {

	public static void main(String[] args) {
		
		
		//1번
		String[] stu = {"김학성","김대현","김지홍","김진우","문세훈",
						"서민규","송원진","송은빈","안정민","안태영",
						"이창훈","임승준","장선우","정동섭","최성수",
						"최영훈","최한솔","한세희","송영록"};
		//2번 - lotto 예제를 이용한 경우
		for(int i=0; i<100; i++) {
		String temp = stu[0];
		int rand = (int)(Math.random()*19);
		stu[0] = stu[rand];
		stu[rand] = temp;
		}
		
		//3번 인원수는? - 사과를 바구니 담기 예제
		Scanner reader = new Scanner(System.in);
		System.out.print("한조당 인원수는:");
		int cntPerTeam = reader.nextInt();
		int cntTeam = stu.length / cntPerTeam;
		cntTeam = (stu.length % cntPerTeam == 0) ? cntTeam : ++cntTeam;
		// 조의 갯수는 19/4 = 4
		// 나머지가 있으면 +1
		System.out.println("총팀수는:"+cntTeam);
		for(int i=0; i<stu.length; i++) {
			if(i%cntPerTeam==0) {					//0 1 2 3
			System.out.print(i/cntPerTeam+1+"조는 ");		//4 5 6 7
			}
			System.out.print(stu[i]+" ");			// 0 1 2 3
			if(i%cntPerTeam==(cntPerTeam-1)) {		// 4 5 6 7
				System.out.println();
			}
		}
			

	}

}
