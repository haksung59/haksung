package com.hk.app;

public class Exam2 {

	public static void main(String[] args) {
		
		CalUtil c1 = new CalUtil();
		c1.setOperand(10, 15);
		c1.sum();
		c1.avg();
		System.out.println(c1.sum()+","+c1.avg());
		c1.setOperand(10,20,30);
		c1.sum();
		c1.avg();
		System.out.println(c1.sum()+","+c1.avg());
		
		NewCalUtil c2 = new NewCalUtil();
		c2.setOperand(10,15);
		System.out.println(c2.avg()+","+c2.substract());

	}

}
