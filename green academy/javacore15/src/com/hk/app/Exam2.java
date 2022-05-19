package com.hk.app;

import java.util.ArrayList;
import java.util.List;

public class Exam2 {

	public static void main(String[] args) {
		
		List myClass = new ArrayList();
		
		// 3명
		StudentVo st1 = new StudentVo("김건우", 90, 85);
		StudentVo st2 = new StudentVo("최한민", 80, 95);
		StudentVo st3 = new StudentVo("송선민", 70, 90);
		
		// 동적배열에 저장
		myClass.add(st1);
		myClass.add(st2);
		myClass.add(st3);
		
		// 학생별로 총점과 평균 출력
		int size = myClass.size();
		int sum=0;
		for(int i=0; i<size; i++) {
			StudentVo temp = (StudentVo)myClass.get(i);
			sum = temp.eng+temp.chn;
			System.out.println(temp.name+" : 합계 = "+sum+ "평균 = "+(sum/2));
		}
		

	}

}
