package com.hk.app;

public class Dfn2dArr2 {

	public static void main(String[] args) {
		
		int[][] Matrix_1 = {
				{3,5,8},
				{4,6,9},
				{2,5,1},
				};
		int[][] Matrix_2 = {
				{1,2,6},
				{5,7,3},
				{3,4,8}
				};
		int[][] sumMat = new int [3][3];
		for(int r=0; r<3; r++) {
			for(int c=0; c<3; c++){
				sumMat[r][c] = Matrix_1[r][c]+Matrix_2[r][c];
				if(sumMat[r][c]<10) {
					System.out.print(" "+sumMat[r][c]+" ");
				}else {
					System.out.print(sumMat[r][c]+" ");
					}
				}
			System.out.println();
		}
		
		for(int r=0; r<3; r++) {
			for(int c=0; c<1; c++) {
				System.out.print(Matrix_1[r][r]+Matrix_2[r][r]+" ");
			}
		}
		
		int sum1=0, sum2=0;
		for(int r=0; r<3; r++) {
			for(int c=0; c<3; c++) {
				if(r==c) {
					sum1 += Matrix_1[r][c];
					sum2 += Matrix_2[r][c];
				}
			}System.out.println(sum1+" "+sum2);
		}

	}

}
