package com.hk.app;

public class MathRandom2 {

	public static void main(String[] args) {
		// 첫번째 랜덤넘버 1-6까지 int dice에 저장해서 출력 : 주사위
		// 두번째 랜덤넘버 0-2까지 int srp에 저장해서 출력 : 가위바위보
		
		int dice = (int)(Math.random() * 6)+1 ;
		System.out.println("주사위의 눈은:"+dice);

		int srp = (int)(Math.random() * 3);
		System.out.println("가위바위보는:"+srp);
		
		switch(dice) {
		case 1: System.out.println("도입니다");break;
		case 2: System.out.println("개입니다");break;
		case 3: System.out.println("걸입니다");break;
		case 4: System.out.println("윷입니다");break;
		case 5: System.out.println("모입니다");break;
		case 6: System.out.println("빽도입니다");break;
		default: System.out.println("낙입니다");break;
		}
	}

}
