package com.hk.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// Scanner클래스를 사용하여 6개 학점('A','C','A','B','F','D')을 문자로 입력받아 ArrayList 저장하고, 
		// ArrayList를 검색하여 학점을 점수(A:4.0, B:3.0, C:2.0, D:1.0, F:0)
		
		
		ArrayList<Character> grade = new ArrayList<Character>();
		
		grade.add('A');
		grade.add('B');
		grade.add('C');
		grade.add('D');
		grade.add('F');
		
		double[] score = {4.0, 3.0, 2.0, 1.0, 0};
		
		Map hash = new HashMap();	// 키 - 값 매칭해서 저장
		
		for(int i=0; i<grade.size(); i++) {
			hash.put(grade.get(i), score[i]);
		}
		
		double sum = 0.0;
		
		for(int i=0; i<6; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("학점을 입력하시오.");
			String reader = sc.next();
			char input = reader.charAt(0);
			
			if(input==grade.get(0)) {
				sum += 4.0;
			}else if(input==grade.get(1)) {
				sum += 3.0;
			}else if(input==grade.get(2)) {
				sum += 2.0;
			}else if(input==grade.get(3)) {
				sum += 1.0;
			}else {
				sum += 0;
			}
		}
		double avg = sum/6;
		System.out.println(avg);

	}

}
