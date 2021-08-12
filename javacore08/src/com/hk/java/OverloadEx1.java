package com.hk.java;

//클래스를 작성시 메소드들은 오버로딩이 가능하다 = 함수이름 같이 써도 된다.
//매개변수 타입이 다르고 갯수가 다르다면 가능.
public class OverloadEx1 {

	public void select(int a, double b) {	}
		//오버로딩 되는가? o - 같은 타입이라도 순서가 다르면 다른 타입으로 봄
	public void select(double b, int a) {	}
	// 매개변수 배열이면?
	public void select(int[] a, double b) { }
}
