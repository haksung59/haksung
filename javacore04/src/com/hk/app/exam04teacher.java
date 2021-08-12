package com.hk.app;

import java.util.Scanner;

public class exam04teacher {

	public static void main(String[] args) {
		//가위 바위 보 게임
		
		System.out.println("[가위 바위 보 게임]");
		int com = (int)(Math.random()*3)+1;
		String com_srp = "";
		if(com==1) com_srp = "가위";
		else if(com==2) com_srp = "바위";
		else com_srp = "보";
		
		Scanner sc = new Scanner(System.in);
		int me = 0;		//0은 초기값으로 약속함.----a
		
		do {	// 입력값이 1-3이 아닌경우 반복구문
			System.out.println("가위(1) 바위(2) 보(3)");
			me =sc.nextInt();	//안에서 선언하면 지역변수 -> 밖에서 선언하면 전역변수 선언----a
		}while(me<1 || me>3);
		
		String me_srp = "";
		if(me==1) me_srp = "가위";
		else if(me==2) me_srp = "바위";
		else me_srp = "보";
		
		// System.out.println(com + "," + me);
		
		String result = "";
		if(com == me) {	// 비김
			result = "Draw Game";
		}else {	// 승부가 남.
			switch(com) {
			case 1: // 가위 - 사람은 가위(1)는 아니다.
				if(me==2) {
					result= "You Win!!";
				}else {
					result= "You Lose.";
				}break;
			case 2:
				if(me == 1) {
					result= "You Lose.";
				}else {
					result="You Win!!";
				}break;
			case 3:
				if(me == 1 ) {
					result = "You Win!!";
				}else {
					result = "You Lose.";
				}
			default:
				break;
			}
		}
		
		System.out.println("컴퓨터가 낸 값은:"+com_srp+"("+com+")");
		System.out.println("사람이 낸 값은:"+me_srp+"("+me+")");
		System.out.println(result);
	}

}
