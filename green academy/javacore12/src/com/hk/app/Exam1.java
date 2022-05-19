package com.hk.app;

public class Exam1 {

	public static void main(String[] args) {
		
		College student1 = new College();
		//학점이 A, B, C, D 계산을 해주는 학생. (90,80,70,60)
		
		Graduate student2 = new Graduate();
		// 학점이 PASS, FAIL 계산을 해주는 학생.(70점기준)
		
		//각각의 클래스 Student 클래스를 상속, 함수 재정의 하시오.
		
		student1.score = 80;
		student2.score = 70;
		student1.computeGrade();
		student2.computeGrade();
		

	}

}
