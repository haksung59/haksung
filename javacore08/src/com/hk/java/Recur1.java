package com.hk.java;

public class Recur1 {

	public static void main(String[] args) {
			
			int N = 5;
			//팩토리얼문제
			//5! = 5*4*3*2*1;
			
			//1번째 - 반복문으로 풀 수 있음.
			
			//2번째 - 재귀함수
			
			int mx = 1;
			mx = fact(N);
			System.out.println("mx:"+mx);
		}
		
		public static int fact(int N) {
			int result=1;
			
			if(N==1) {
				result = 1;
			}else {
				result = N*fact(N-1);
			}
			return result;
		}

	

}
