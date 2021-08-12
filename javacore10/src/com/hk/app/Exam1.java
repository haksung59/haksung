package com.hk.app;

public class Exam1 {

	public static void main(String[] args) {
		
		//메인클래스
		// 2차원 원 참조변수 만들고 출력
		
		Shape2DVo circle = new Shape2DVo();
		circle.setX(10); circle.setY(5);
		System.out.println("circle의 좌표는 ("+circle.getX()+","+circle.getY()+")");
		
		BallUtil ball = new BallUtil();
		ball.setX(4); ball.setY(3); ball.setZ(5); ball.setRadius(10);
		
		System.out.println("좌표출력=("+ball.getX()+","+
									 ball.getY()+","+
									 ball.getRadius()+")");
		System.out.println(ball.calVolume());

	}

}
