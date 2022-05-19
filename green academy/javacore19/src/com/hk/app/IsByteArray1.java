package com.hk.app;

// import java.io.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IsByteArray1 {

	public static void main(String[] args) {
		
		byte[] msrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // 십진수 형태의 이진데이터가 있다면
		byte[] result = null;
		
		// InoutStream을 상속한 객체로 변수 선언
		ByteArrayInputStream bain = null;
		ByteArrayOutputStream baout = null;
		
		bain = new ByteArrayInputStream(msrc);	// 소스
		baout = new ByteArrayOutputStream();	// 대상
		
		int data = 0;	//전송할 데이터를 담아두는 임시변수
		while( (data=bain.read()) != -1) {	//바이트 단위로 데이터를 읽어들인다.
			//데이터를 읽었을 때 없으면 -1 이므로 반대로 있으면 데이터 있다는 의미 -> 계속 읽어드림
			baout.write(data);
			
		}	// 1바이트씩 읽고 저장 읽고 저장 -> 반복함.
		
		// 바이트 배열에 저장.
		result = baout.toByteArray();	//스트리음 배열로 변환.
		
		System.out.println(Arrays.toString(result));		//배열주소 -> 문자열로 출력
		

	}

}
