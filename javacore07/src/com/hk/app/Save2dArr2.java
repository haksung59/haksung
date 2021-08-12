package com.hk.app;

public class Save2dArr2 {

	public static void main(String[] args) {
		
		
		int[][] result2 = new int[5][5];
		//pt 내용처럼 1-25까지 저장해서 출력하시오.
		int row = result2.length; //5
		int col = result2[0].length; // 같은 열의 길이 일때 5
		
		int num=1;
		
		for(int r=0; r<row; r++) {
			if(r%2==0) {
				for(int c=0; c<col; c++) {
					result2[r][c] = num++;
				}
			}else {
				for(int c=col-1; c>=0; c--) {
					result2[r][c] = num++;
				}
			}
		}
		
		for(int r=0; r<row; r++) {
			for(int c=0; c<col; c++) {
				if(result2[r][c]<10)
					System.out.print(" "+result2[r][c]+" ");
				else
					System.out.print(result2[r][c]+" ");
			}
			System.out.println();
		}

	}

}
