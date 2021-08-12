package com.hk.app;

public class CmdGame {

	public static void main(String[] args) {
		
		// 장비를 설정
		WeaponVo wpRabbit = new WeaponVo();	//WeaponVo로 참조변수에 멤버변수들 초기화
		//wpRabbit.setShoes(1);				//토끼의 신발 1개
		//wpRabbit.Shoes = 1;				//private이기 때문에 직접 접근이 안됨.
		System.out.println("토끼신발갯수="+wpRabbit.getShoes());

	}

}
