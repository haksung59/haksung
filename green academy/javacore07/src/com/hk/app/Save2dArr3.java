package com.hk.app;

public class Save2dArr3 {

	public static void main(String[] args) {
		
		int[][] Mat = new int[5][5];
		
		int row = Mat.length;
		int col = Mat[0].length;
		
		int num=1;
		
		for(int r=0; r<row; r++) {
			if(r%2==0) {
				for(int c=0; c<col; c++) {
					Mat[r][c] = num;
					num++;
				}
			}else {
				for(int c=col-1; c>=0; c--) {
					Mat[r][c] = num;
					num++;
				}
			}
		}
		for(int r=0; r<row; r++) {
			for(int c=0; c<col; c++) {
				if(Mat[r][c]<10) {
					System.out.print(" "+Mat[r][c]+" ");
				}else {
					System.out.print(Mat[r][c]+" ");
				}
			}System.out.println();
		}
		
		int sumx1 = 0;
			for(int y=0; y<col; y++) {
				sumx1 += Mat[0][y];
		}System.out.println("1행의 합 = "+sumx1);
		
		int sumy1 = 0;
			for(int y1=0; y1<col; y1++) {
				sumy1 += Mat[y1][0];
			}System.out.println("1열의 합 = "+sumy1);
		
		int sumcr = 0;
		for(int r=0; r<row; r++) {
				sumcr += Mat[r][r];
		}System.out.println("오른쪽방향 대각선의 합 = "+sumcr);
		
		int sumcl = 0;
		for(int r=row-1,c=0; r>=0; r--,c++) {
			sumcl += Mat[r][c];
		}System.out.println("왼쪽방향 대각선의 합 = "+sumcl);
		
	}

}
