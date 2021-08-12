package com.hk.app;

public class Graduate extends Student{
	
	public void computeGrade() {
		if(score>=70) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
	}

}
