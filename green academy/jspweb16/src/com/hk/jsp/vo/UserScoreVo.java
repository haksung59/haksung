package com.hk.jsp.vo;

public class UserScoreVo {
	
	//영어 수학 과학
	//eng
	//mat
	//sci
	
	//게터,세터
	
	private String name;
	private int eng;
	private int mat;
	private int sci;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	

}
