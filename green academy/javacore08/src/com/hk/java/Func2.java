package com.hk.java;

public class Func2 {

	public static void main(String[] args) {
		
		// 1~10까지 합해서 출력하는 함수 만들어라
		sum1_10();
		// 1~10까지 합을 구하는 함수의 결과가 짝수인지 홀수인지 체크
		int result= sum(1,10);
		if(result%2==0)
			System.out.println(result+"는 짝수임");
		else
			System.out.println(result+"는 홀수임");
	}
	
	// 일만하는 함수 예제 - void 를 사용-반환값이 없음.
	public static void sum1_10() {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1-10까지 합은 : "+sum);
	}
	
	// 일을 하고 값을 반환하는 함수 예제 - int(반환(return)값의 타입)
	public static int sum(int s, int e) {
		int sum2 = 0;
		for(int k=s; k<=e; k++) {
			sum2 += k;
		}
		return sum2;
	}
	
	// 함수의 형태구조
	// [public static] 옵션 리턴타입(void, int, double) 모든 타입 함수명(타입 입력파라미터...)
	// {
	//			 반복적으로 사용되는 코드
	//			return; 없는경우
	//			[또는] return 변수나 값;
	// }
	

}
