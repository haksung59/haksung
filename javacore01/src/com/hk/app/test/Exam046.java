package com.hk.app.test;

public class Exam046 {

	public static void main(String[] args) {
		
		//2x3 행렬과 3x2행렬에 임의의 값을 대입하고 행렬의 곱을 출력하시오.
		
		int[][] mat1 = new int[2][3];
		int[][] mat2 = new int[3][2];
		
		int[][] multiplication = new int[2][2];
		
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
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				mat2[i][j] = (int)(Math.random()*100);
				if( mat2[i][j]<10) {
					System.out.print(" "+mat2[i][j]+" ");
				}else {
					System.out.print(mat2[i][j]+" ");
				}
			}System.out.println();
		}
		System.out.println("multiplicaion =");
		for(int i=0; i<mat1.length; i++) {
			for(int j=0; j<mat2[0].length; j++) {
				for(int k=0; k<mat1.length; k++) {
					multiplication[i][j] += mat1[i][k]*mat2[k][j];
				}
				if( multiplication[i][j]<10) {
					System.out.print(" "+multiplication[i][j]+" ");
				}else {
					System.out.print(multiplication[i][j]+" ");
				}
			}System.out.println();
		}
		

	}

}
