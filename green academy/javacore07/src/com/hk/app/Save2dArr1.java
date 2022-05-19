package com.hk.app;

public class Save2dArr1 {

	public static void main(String[] args) {
		
		int[][] matrix = new int[5][5];
		int[][] result = new int[5][5];
		//pt 내용처럼 1-25까지 저장해서 출력하시오.
		int row = matrix.length; //5
		int col = matrix[0].length; // 같은 열의 길이 일때 5
		
		int num = 1;
		for(int r=0; r<row; r++) {
			for(int c=0; c<col; c++) {
				result[r][c]=num;
				num++;
				if(result[r][c]<10)
					System.out.print(" "+result[r][c]+" ");
				else
				System.out.print(result[r][c]+" ");
			}System.out.println();
		}

	}

}
