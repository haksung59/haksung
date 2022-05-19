package com.hk.app;

//장비 정보
public class WeaponVo {
	private int shoes;		// 신발갯수
	private int glasses;	// 안경갯수
	
	public WeaponVo() {
		shoes = 0;
		glasses = 0;
	}
	
	// 게터세터
	public int getShoes() {
		return shoes;
	}

	public void setShoes(int shoes) {
		this.shoes = shoes;
	}

	public int getGlasses() {
		return glasses;
	}

	public void setGlasses(int glasses) {
		this.glasses = glasses;
	}

}
