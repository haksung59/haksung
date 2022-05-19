package com.hk.app;

public class MainClassTV {

	public static void main(String[] args) {
		
		// 클래스를 사용하지 않는 프로그램
		String colorTV1 = "노란색";
		boolean powerTV1 = true;
		
		String colorTV2 = "노란색";
		boolean powerTV2 = true;
		
		System.out.println("TV2번의 색상은 : "+colorTV2);

		// 클래스를 가져다 쓰려면 [선언방법] *2*
		// 클래스명 변수명 = new 클래스명();
		// 클래스를 사용하여 만든 프로그램
		DfnClassTV TV1 = new DfnClassTV();
		DfnClassTV TV2 = new DfnClassTV();
		
		// 선언된 변수 [사용방법] *3*
		// 변수명.클래스에 정의된 변수명
		
		TV1.color = TV2.color = "빨간색";
		TV1.power = TV2.power = false;
		System.out.println("TV2번의 색상은 : "+TV2.color);
		
	}

}
