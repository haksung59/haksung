package com.hk.app;

public class TestBikeVo {

	public static void main(String[] args) {
		
		BikeVo mbike = new BikeVo(2,"페달");
		System.out.println("내 자전거 바퀴 갯수는:" + mbike.getWheel());
		System.out.println("내 자전거 엔진은:"+mbike.getengineType());
		
		BikeVo fbike = new BikeVo(4,"전기");
		System.out.println("아버지 자전거 바퀴 갯수는:"+fbike.getWheel());
		System.out.println("아버지 엔진은:"+fbike.getengineType());
		// 아버지 자전거의 엔진은: 전기.
		BikeVo mine = new BikeVo();
		System.out.println(mine.getWheel());
		System.out.println(mine.getengineType());
		
		AserviceVo mservice = new AserviceVo('n', 2, 10);
		AserviceVo fservice = mservice;
		
		//속도계기판
		//내 자전거 최고속도(초기값) 50
		//아버지 자전거 최고속도(초기값) 30 생성자로 초기화
		
		// 두 자전거의 속도를 올렸을 때
		// 현재 속도를 출력하시오.
		
		
		
		Instrument mIns = new Instrument(50);
		Instrument fIns = new Instrument(30);
		System.out.println("내 자전거의 현재속도:"+mIns.showSpeed());
		System.out.println("아버지 자전거의 현재속도:"+fIns.showSpeed());
		
		mIns.speedUp(10);mIns.speedUp(45);mIns.breaker(20);
		System.out.println("내 자전거의 현재속도:"+mIns.showSpeed());
		fIns.speedUp(20);fIns.speedUp(20);
		System.out.println("아버지 자전거의 현재속도:"+fIns.showSpeed());
		
	}

}
