package com.hk.app;

public class AccesaryVo {
	
	// 기본
	int bell;
	int light;
	
	// 추가
	String breaker;	// break 예약어

	public int getBell() {
		return bell;
	}

	public void setBell(int bell) {
		this.bell = bell;
	}
	
	public int getLight() {
		return light;
	}

	public void setLight(int light) {
		this.light = light;
	}

	public String getBreaker() {
		return breaker;
	}

	public void setBreaker(String breaker) {
		this.breaker = breaker;
	}

	
	
	//getter(리턴함수), setter(변경함수)
	//이클립스 자동생성 가능
	//1-멤버변수를 만들고
	//2-Source-Generate Getter Setter
	
	
}
