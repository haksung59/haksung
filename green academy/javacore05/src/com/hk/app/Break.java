package com.hk.app;

public class Break {

	public static void main(String[] args) {
		
		
		//슈팅게임 비행기 * 3대
		
		System.out.println("비행기 게임을 시작합니다!");
		int time=0;
		int plane=3;
		while(true) {
			time++;
			if(plane==0) {	//비행기가 모두 터지면 게임종료
				break;
			}
			try {
				Thread.sleep(1000); // 1초동안 메인 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(time==5) plane--; //5초때 비행기가 터졌다.
			if(time==10) plane--; //10초때
			if (time==15) plane--; // 15초때 비행기가 터졌다.
			System.out.println("게임진행시간:"+time+"비행기 x "+plane);
		}
		System.out.println("게임 종료");
	}

}
