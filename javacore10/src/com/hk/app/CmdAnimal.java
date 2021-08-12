package com.hk.app;

public class CmdAnimal {
	
	static int time = 0;
	static int width = 11; //전체 너비
	static int height = 11; // 전체 길이
	static int[][] map = new int[width][height];

	static Rabbit bucks = new Rabbit();
	static Grass flower = new Grass();
	
	static Character[] chr = new Character[2];
	
	final static String SPACE = "ㆍ";
	final static String RABBIT = "♡";
	final static String GRASS = "★";
	
	static {	//초기화 블록
		for(int r=0; r<width; r++) {
			for(int c=0;c<height; c++) {
				map[r][c] = 0;
			}
		}
		
		chr[0] = new Character();
		chr[1] = new Grass();
	}
	// map 배열정보로 화면을 그리는 함수
	public static void DrawMap() {
		for(int r=0; r<width; r++) {
			for(int c=0;c<height; c++) {
				if(map[r][c] == 0) {
					System.out.print(SPACE);
				}else if(map[r][c] == 1){
					System.out.print(RABBIT);
				}else if(map[r][c] == 2) {
					System.out.print(GRASS);
				}
			}
			System.out.println();
		}
	}
	
	public static void ChangeMapByRabbit(Character rab) {	//Rabbit 클래스의 변수로 맵 정보 변경
		//rab.rx rab.cy => 토끼의 좌표정보.
		map[rab.rx][rab.cy] = 1;	//1 은 토끼가 있다는 표시.
	}
	public static void ChangeMapByGrass(Character gr) {
		map[gr.rx][gr.cy] = 2;
	}
	
	
	public static void main(String[] args) {
		
		bucks.initPos();	// ->전체너비가 변경될 때 중앙에 배치(오버로딩)
		flower.initPos();	// -> 전체 너비가 변경될 때 랜덤하게 배치
		
		while(time<100) {
			Screen.clearconsole();
			
			ChangeMapByRabbit(bucks);
			ChangeMapByGrass(flower);
			
			DrawMap();
			
			System.out.println("현재시간: "+ time);
			
			System.out.println(("bucks"+RABBIT+"의 행,열 좌표는: ("+bucks.rx+","+bucks.cy+")"));
			
			System.out.println(("flower의 행좌표는: ("+flower.rx+","+flower.cy+")"));
			time++;
			try {
				Thread.sleep(1000);		// 메인프로그램 1초동안 정지.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
