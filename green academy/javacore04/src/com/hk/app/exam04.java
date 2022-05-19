package com.hk.app;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		// 가위 바위 보 게임
		// 컴퓨터 랜덤하게 가위(1) 바위(2) 보(3) 발생시켜준다.
		// 자신은 가위(1) 바위(2) 보(3) 중 하나를 선택한다.
		
		// 누가 이기겠는가? 출력
		// 1-사람이 승리
		// 2-컴퓨터가 승리
		// 3-무승부
		
		int com = (int)(Math.random() * 6)+1 ;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) !");
		int user = sc.nextInt();
		
		if (com == 1) {
			if (user == 1) {
				System.out.println("가위 vs 가위 비겼습니다.");
			}else if (user == 2) {
				System.out.println("바위 vs 가위 이겼습니다.");
			}else
				System.out.println("보 vs 가위 졌습니다.");
		}else if (com == 2) {
			if (user == 1) {
				System.out.println("가위 vs 바위 졌습니다.");
			}else if (user == 2) {
				System.out.println("바위 vs 바위 비겼습니다.");
			}else {
				System.out.println("보 vs 바위 이겼습니다.");
			}
		}else if (user == 3){
			if (user==1) {
				System.out.println("가위 vs 보 이겼습니다.");
			}else if (user == 2) {
				System.out.println("바위 vs 보 졌습니다.");
			}else {
				System.out.println("보 vs 보 비겼습니다.");
			}
			}else {
				System.out.println("1~3중의 값을 입력하시오.");
		}
		
		

	}

}
