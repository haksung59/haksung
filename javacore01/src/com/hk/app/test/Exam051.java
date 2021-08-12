package com.hk.app.test;

public class Exam051 {
	
	public static void Sort(int[] arr) {
		
		for(int i=arr.length; i>1; i--) {
			for(int j=1; j<i; j++) {
				if(arr[j]>arr[j-1]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		//다음 배열변수의 숫자를 내림차순으로 정렬하시오.
		//34, 24, 61, 90, 12 => 배열을 정렬해서 출력하시오.
		
		int[] num = {34, 24, 61, 90, 12};
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		Sort(num);
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}

		
		

	}

}
