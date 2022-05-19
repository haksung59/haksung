package com.hk.app;

public class AserviceVo {
	
	// 서비스 속성
	//1-제품등록여부 char reg - y, n
	//2-as기간 int aperiod 1년 2년 3년
	//3-할인서비스 int sale 10% 20% 30%
	
	//게터와 세터를 생성하시오.
	
	char reg;
	int aperiod;
	int sale;
	
	public char getReg() {
		return reg;
	}
	public void setReg(char reg) {
		this.reg = reg;
	}
	public int getAperiod() {
		return aperiod;
	}
	public void setAperiod(int aperiod) {
		this.aperiod = aperiod;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	AserviceVo(char reg, int aperiod, int sale){
		this.reg = reg;
		this.aperiod = aperiod;
		this.sale = sale;
	}
	AserviceVo(AserviceVo as){ // 매개변수를 참조변수로 입력
		this(as.reg, as.aperiod, as.sale);
	}
	
	
}
