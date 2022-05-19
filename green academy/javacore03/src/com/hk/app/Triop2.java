package com.hk.app;

public class Triop2 {

	public static void main(String[] args) {
		// 삼항식 이용 y가 양수, 음수, 0 판단하시오
		int y=0;
		String result = (y>0) ? "양수" :  (y<0) ?  "음수" : "제로" ;
		System.out.println(y+"는"+result);
		
			
	}

}
