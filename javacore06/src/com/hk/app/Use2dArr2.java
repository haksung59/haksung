package com.hk.app;

public class Use2dArr2 {

	public static void main(String[] args) {
		
		// 1차원 배열
		String[] name1 = {"김학성","최한솔","정동섭",
						  "문세훈","최성수","송원진",
						  "안태영","김지홍","장선우",
						  "김진우","김대현","서민규"};
		//	2차원 3x3
		String[][] name2 = {	{"김학성","최한솔","정동섭","안찬익"},
								{"문세훈","최성수","송원진",},
								{"안태영","김지홍","장선우",},
								{"김진우","김대현","서민규",}
							};
		//각 배열 출력하시오.
		
		for(int i=0; i<name1.length; i++) {
			System.out.print(name1[i]+" ");
			if(i%3==2) {	// 3열씩
				System.out.println();
			}
		}
		System.out.println();
		
		// 2차원 출력
		for(int r=0; r<name2.length; r++) {
			for(int c=0; c<name2[c].length; c++) {
				System.out.print(name2[r][c]+" ");
			}
			System.out.println();
		}
	}

}
