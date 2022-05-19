package com.hk.app;

public class Exam1 {

	public static void main(String[] args) {
		
		//두 좌표의 거리를 구하는 자바 프로그램 작성
		//Mapdist 클래스를 만들고
		//X1,Y1 = 좌표입력
		//X2,Y2 = 좌표입력.
		int width = 11;
		int height = 11;
		int rabX; int rabY;	//각각의 좌표를 대입.
		//좌표범위는 0~10사이에서 계산.
		int grX; int grY;	// 각각의 좌표를 대입.
		
		// 토끼의 좌표 중앙에 있다고 가정.
		rabX = width / 2;	//5
		rabY = height / 2;	//5
		//풀의 좌표는 랜덤하다고 가정.
		grX = (int) Math.floor(Math.random()*width);
		grY = (int) Math.floor(Math.random()*height);
		
		MapDist rab2gr = new MapDist(rabX, rabY, grX, grY);
		rab2gr.calDistance();
		
		System.out.println("토끼와 풀의 거리는 : "+ rab2gr.dist);

		
		

	}

}
