package com.hk.app;

public class UseArr3_teacher {

	public static void main(String[] args) {
		
		// 배열을 활용하여 다음과 같이 출력하시오.	
		// 번호	국어	영어	수학	총점	평균
		//============================
		// 1	100	100	100	300	100.0
		// 2	20	20	20	60	20.0
		// 3	30	30	30	90	30.0
		// 4	40	40	40	120	40.0
		// 5	50	50	50	150	50.0
		//============================
		// 총점	240	240	240	
		
			//초기데이터
		
			int[] score = {100, 100, 100,
							20, 20, 20,
							30, 30, 30,
							40, 40, 40,
							50, 50, 50};
			//제목출력
			System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t");
			System.out.println("==============================================");
			
			int sumKo=0, sumEn=0, sumMa=0;
			for(int r=0; r<5; r++) {
				int num = r+1;
				System.out.print(num+"\t");
				sumKo += score[3*r];
				sumEn += score[3*r+1];
				sumMa += score[3*r+2];
				int sumOfMan = 0;
				for(int c = (3*r); c<(3*r)+3; c++) {
					// r=0 -> 0,1,2
					// r=1 -> 3,4,5
					System.out.print(score[c]+"\t");
					sumOfMan += score[c];
				}
				System.out.print(sumOfMan+"\t");
				System.out.print((double)sumOfMan/3+"\t");
				System.out.println();
			}
			System.out.println("==============================================");
			System.out.print("합계\t"+sumKo+"\t"+sumEn+"\t"+sumMa);
	}

}
