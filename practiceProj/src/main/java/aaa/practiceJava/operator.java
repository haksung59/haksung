package aaa.practiceJava;

import aaa.vo.TestVo;

public class operator {

	public static void main(String[] args) {
		
		TestVo vo = new TestVo();
		
		double pi = 3.141592;
		double shortPi = Math.round(pi*1000) / 1000.0;
		System.out.println(shortPi);
		
		int x = 1;
		int y = 1;
		System.out.println("x:1,y:1 / x|y = " + Integer.toString(x|y));	// '|' --> 둘 중 하나가 1이면 1
		System.out.println("x:1,y:1 / x&y = " + Integer.toString(x&y));	// '%' --> 둘 다 1이면 1
		System.out.println("x:1,y:1 / x^y = " + Integer.toString(x^y));	// '^' --> 둘이 다르면 1
		System.out.println("------------------");
		x=1;
		y=0;
		System.out.println("x:1,y:0 / x|y = " + Integer.toString(x|y));	// '|' --> 둘 중 하나가 1이면 1
		System.out.println("x:1,y:0 / x&y = " + Integer.toString(x&y));	// '%' --> 둘 다 1이면 1
		System.out.println("x:1,y:0 / x^y = " + Integer.toString(x^y));	// '^' --> 둘이 다르면 1
		
		x = 0xAB;
		y = 0xF;
		
		System.out.println("x=0xAB ->"+Integer.toBinaryString(x));
		System.out.println("y=0xF ->"+Integer.toBinaryString(y));
		System.out.println("x|y ->"+Integer.toBinaryString(x|y));
		System.out.println("x&y ->" + Integer.toBinaryString(x&y));
		
		System.out.println(~x+1);	//부호 바꾸기
		
		x=10;
		System.out.println("x=10, n=3 / x*2^n = x<<n ->" + Integer.toString(x<<3));
		
		System.out.println("x=10, n=3(2^3=8) / x/2^n = x>>n ->" + Integer.toString(x>>3));
		
		x=100;
		y=89;
		boolean result = (x > y) ? true : false;	//괄호가 참이면 true, 거짓이면 false
		System.out.println("------------------------------------");
		System.out.println("x=100, y=89");
		System.out.println("(x>y) ? true : flase -> " +result);
		String result2 = (x>y) ? "x가 더 커요" : "y가 더 커요";
		System.out.println(result2);
		String result3 = (x==y) ? "둘이 같아요" : "둘이 달라요";
		System.out.println(result3);
		
		
		
	}

}
