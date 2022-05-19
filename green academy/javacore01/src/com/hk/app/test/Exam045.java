package com.hk.app.test;

public class Exam045 {

	public static void main(String[] args) {
		
		//2행 3열의 2차원 배열 두개 (mat1,mat2)를 만들어 임의의 값을 대입하고 mat1+mat2를 출력하시오.
		
		int[][] mat1 = new int[2][3];
		int[][] mat2 = new int[2][3];
		
		System.out.println("mat1 = ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				mat1[i][j] = (int)(Math.random()*100);
				if( mat1[i][j]<10) {
					System.out.print(" "+mat1[i][j]+" ");
				}else {
					System.out.print(mat1[i][j]+" ");
				}
			}System.out.println();
		}
		System.out.println("mat2 = ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				mat2[i][j] = (int)(Math.random()*100);
				if( mat2[i][j]<10) {
					System.out.print(" "+mat2[i][j]+" ");
				}else {
					System.out.print(mat2[i][j]+" ");
				}
			}System.out.println();
		}
		int[][] sum = new int[2][3];
		System.out.println("sum =");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				sum[i][j] = mat1[i][j]+mat2[i][j];
				if(sum[i][j]<10) {
					System.out.print(" "+sum[i][j]+" ");
				}else {
					System.out.print(sum[i][j]+" ");
				}
			}System.out.println();
		}
	}

}
