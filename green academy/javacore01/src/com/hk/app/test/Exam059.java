package com.hk.app.test;

public class Exam059 {

	public static void main(String[] args) {
		
		// 두개의 1차원 배열을 합쳐서 출력하시오.
		//mat1 = {1,3,5,7,9}
		//mat2 = {2,3,6,8,10} 두개의 배열을 합쳐서 출력
		
		int[] mat1 = {1,3,5,7,9};
		int[] mat2 = {2,3,6,8,10};
		
		int mat1leng = mat1.length;
		int mat2leng = mat2.length;
		
		int[] mat3 = new int[mat1leng+mat2leng];
		System.arraycopy(mat1, 0, mat3, 0, mat1leng);
		System.arraycopy(mat2, 0, mat3, mat1leng, mat2leng);
		
		for(int i=0; i<mat3.length; i++) {
			System.out.print(mat3[i]+" ");
		}

	}

}
