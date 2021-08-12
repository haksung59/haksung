package com.hk.app;

// comparable 인터페이시이다
public class BoxCompare implements Comparable{

	private double volume;	//볼륨이란 숫자 정의
	// 생성자
	public BoxCompare(double vol) {
		volume = vol;
	}
	
	// 상속을 받아서 구현 - 비교기능
	@Override
	public int compareTo(Object o) {
		// 같다, 음수면 자신이 작음, 양수면 자신이 크다
		BoxCompare temp = (BoxCompare)o;
		if(this.volume < temp.volume) {
			return -1;
		}else if(this.volume > temp.volume){
			return 1;
		}else {
			return 0;
		}
	}
	// main 함수
	public static void main(String[] args) {
		
		BoxCompare box1 = new BoxCompare(100);
		BoxCompare box2 = new BoxCompare(200);
		
		if(box1.compareTo(box2) > 0) {
			System.out.println("box1 > box2");
		}else if(box1.compareTo(box2) < 0) {
			System.out.println("box1 < box2");
		}else {
			System.out.println("box1 = box2");
		}
	}

}
