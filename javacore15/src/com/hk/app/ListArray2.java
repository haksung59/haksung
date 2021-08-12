package com.hk.app;

import java.util.ArrayList;		//jdk 제공 라이브러리
import java.util.List;

public class ListArray2 {

	public static void main(String[] args) {
		
		//토끼 참조 변수를 담는 동적 배열 선언
		List grRabbit = new ArrayList();
		
		RabbitVo r1 = new RabbitVo(0, 0, true);
		RabbitVo r2 = new RabbitVo(10,10,true);
		
		grRabbit.add(r1);
		grRabbit.add(r2);
		
		int size= grRabbit.size();

		for(int i=0; i<size; i++) {
			RabbitVo temp = (RabbitVo)grRabbit.get(i); //object -> RabbitVo
			System.out.println(temp.x);
			System.out.println(temp.y);
			System.out.println(temp.life);
		}

	}

}
