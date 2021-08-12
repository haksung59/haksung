package com.hk.app;

public class UseArr3 {

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
		
		int num[] = {1,2,3,4,5};
		
		int score[] = {100,20,30,40,50};
		
		String subject[] = {"번호","국어","영어","수학","총점","평균"};
		
		for (int i=0; i<subject.length; i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println();
		System.out.println("==============================================");
		
		int sum[] = new int[5];
		double avg[] = new double[5];
		int sum2 = 0;
		
		for (int i=0; i<num.length; i++) {
			sum[i]= score[i]*3;
			avg[i]= sum[i]/3;
			System.out.println(num[i]+"\t"+score[i]+"\t"+score[i]+"\t"+score[i]+"\t"+sum[i]+"\t"+avg[i]);
		}
		System.out.println("==============================================");
		for (int i=0; i<5; i++) {
			sum2 += score[i];
		}System.out.print("총점"+"\t"+sum2+"\t"+sum2+"\t"+sum2);

	}

}
