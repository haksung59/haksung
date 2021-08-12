package com.hk.app;

public class UseArr6 {

	public static void main(String[] args) {
		// 제목 : 로또 프로그램
		// 1번째 45개의 구슬 - 차례대로 번호
		
		int[] ball = new int[45];
		
		//2번째 구슬의 번호를 매기기
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;	//   1 2 3 4 ... 45
			
		}
		// 3번째 섞기 - 카드게임
		// index i = 0 1 2 3 4 5 6 7 8 9 ....
		// ball[i] = 1 2 3 4 5 6 7 8 9 10 ...
		// i = 0 번째인 ball[0] --> int temp = ball[0]임시저장
		// 0~44까지 랜덤하게 숫자를 골라서 rand 라고 하면
		// ball[0] = ball[rand] 대입하고
		// ball[rand] = temp;
		// ball [i] = 10 2 3 4 5 6 7 8 9 1 ...
		// ball [i] = 4 2 3 10 5 6 7 8 9 1 ...
		for(int k=0; k<100; k++) {
			int temp = ball[0];
			int rand = (int)(Math.random()*45);		// 인덱스값이기 때문에 +1 필요없음.
			ball[0] = ball[rand];
			ball[rand] = temp;
		}
		// 0부터 5번까지 공의 값을 출력하시오.
		for(int n=0; n<6; n++) {
			System.out.print(ball[n]+" ");
		}
	}

}
