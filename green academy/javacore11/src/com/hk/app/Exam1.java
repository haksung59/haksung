package com.hk.app;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		
		// kim 씨의 시간당 급여를 변경.
		Salary kim = new Salary();
		// 시급을 변경하기 전에 10시간을 일했다면 급여 출력
		// 10000원
		
		// 시급을 변경한 후에 10시간을 일했다면 급여 출력
		// 15000원으로 변경하고서(변경시 아이디 패스워드가 맞아야 함.)
		
		kim.setRate(10000); kim.setHour(11);
		if(kim.getHour()>=10) {
			System.out.println("kim의 급여는 "+(kim.getRate()*kim.getHour())+"원 입니다.");
		}
		
		Scanner input = new Scanner(System.in);
		System.out.print("ID를 입력하시오.");
		String id = input.next();
		System.out.print("비밀번호를 입력하시오.");
		String pw = input.next();
		System.out.print("변경할 급여를 입력하시오.");
		int pay = input.nextInt();
		
		kim.setHour(10);
		kim.setRate(id,pw,pay);
		
		
		
	}

}
