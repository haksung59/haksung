package com.hk.java;

public class exam3 {

	public static void main(String[] args) {
		
		int[] scores = new int[10];
		// StudentVo.java 생성해서 클래스를 정의한다.
		StudentVo kim = new StudentVo();
		// 학번과 아이디를 변경하고
		
		// 출력하시오.
		 kim.id = 1; kim.name = "김학성";
		
		
		kim.setId(1);
		kim.setName("김학성");
		System.out.println(kim.getId());
		
	}

}
