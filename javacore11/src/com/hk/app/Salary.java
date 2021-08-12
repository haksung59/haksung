package com.hk.app;

public class Salary {
	
	private int rate; // 시간당 급여(클래스 내에서만 접근)
	private int hour; // 시간
	
	
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public boolean setRate(String id, String pw, int rate) {
		boolean result= false;
		if(id.equals("admin")) {
			
			if(pw.equals("8090")) {
				this.rate = rate;
				result = true;
			}else {
				System.out.println("비밀번호를 확인 바랍니다.");
			}
		}else {
			System.out.println("아이디를 확인 바랍니다.");
		}
		
		if(getHour()>=10 && result==true) {
			System.out.println("kim의 급여는 "+(getRate()*getHour())+"원 입니다.");
		}
		return result;
	}

	
}
	
	// 오버로딩
	// setRate(String id, String pw, int rate){}
	// admin / 8090이면 시간당 급여를 변경가능.
	
	
	


