package com.hk.app;

public class ExMainClass {

	public static void main(String[] args) {
		
		//보드의 정보 ExBoardClass
		//1 가로크기 : 정수 width
		//2 세로크기 : 정수 height
		
		//말의 정보
		//1 말의 색상 : char color = "r,b,g,y"
		//2 말의 번호 : int no = 1,2,3,4
		
		ExBoardClass board = new ExBoardClass();
		ExHorseClass horse1 = new ExHorseClass();
		ExHorseClass horse2 = new ExHorseClass();
		
		board.width = 350;
		board.height = 250;
		
		horse1.color = 'r';
		horse1.no = 1;
		horse2.color = 'b';
		horse2.no = 2;
		
		System.out.println("보드사이즈는: "+board.width+"X"+board.height);
		System.out.println("빨간말:"+horse1.color+"-"+horse1.no);
		System.out.println("파란말:"+horse2.color+"-"+horse2.no);
	}

}
