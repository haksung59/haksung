package aaa.practiceJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aaa.vo.TestVo;

public class Variable {

	public static void main(String[] args) {
		
		System.out.println("test");
		System.out.println("hi");
		
		final int aa = 90;	//aa 변경 불가
		
		long big = 100000000L;
		
		System.out.println(big);
		
		float pi = 3.1456f;
		
		double aaa = 2e0+1e-3;
		System.out.println(aaa);
		
		int age = 14;
		
		System.out.printf("age:%d", age);
		
		TestVo test1 = new TestVo();
		
		List<TestVo> listtest = new ArrayList<>();
		System.out.println();
		System.out.println("문자를 입력해라");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		test1.setTest1(input);
		test1.setTest2(Integer.toString(age));
		
		listtest.add(test1);
		
		System.out.println(listtest);
		
		boolean hi = false;
		System.out.println(hi);
		char backspace = '\b';
		System.out.println("abc\t123"+backspace+"456");
		
		System.out.println((char)65);
		
		System.out.println((int)1.3f);
		
		int i= 53515;
		byte b = (byte)i;
		
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);
		
		System.out.println("i="+Integer.toBinaryString(i));
		
		float f = (float)i;
		System.out.println(f);
		
	}

}
