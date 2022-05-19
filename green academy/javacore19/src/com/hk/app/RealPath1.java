package com.hk.app;

public class RealPath1 {

	public static void main(String[] args) {
		
		String realPath1 = "c:\\temp"; // c 드라이브에 temp라는 폴더. => 스토리지가 독립적으로 있는 경우
		
		String workPath1 = System.getProperty("user.dir");
		String workPath2 = workPath1 + "\\text";
		
		System.out.println(realPath1);
		
		System.out.println(workPath1);

		System.out.println(workPath2);
	}

}
