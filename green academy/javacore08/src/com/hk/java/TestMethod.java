package com.hk.java;

public class TestMethod {

	public static void main(String[] args) {
		
		MethodClass lion1 = new MethodClass();
		MethodClass.plusTotal(1);
		// 라이온1번
		lion1.leg = 4; lion1.fname="햄버거"; lion1.color='y';
		lion1.eatFood();
		
		// 토끼1번
		MethodClass rab1 = new MethodClass();
		MethodClass.plusTotal(1);
		rab1.leg = 4; rab1.fname="당근"; rab1.color='w';
		rab1.eatFood(); // 인스턴스 메소드
		
		// 전체 동물은 몇마리인가?
		System.out.println("전체동물수:"+MethodClass.getTotal());
		// 클래스 메소드는 참조변수 생성하지 않는다.

	}

}