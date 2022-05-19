package com.hk.app;

public class Exam4 {

	public static void main(String[] args) {
		
		String strEng = "You will have to submit to your fate whether you will or not";
		//자음 모음 공백(옵션) 갯수를 출력하시오.
		
		String[] word = strEng.split("");
		String Vow = "aeiouAEIOU";
		String blank = " ";
		
		int VN = 0;
		int BN = 0;
		int CN = 0;
		
		String[] Vowel = Vow.split("");
		
		for(int i=0; i<word.length; i++) {
			for(int j=0; j<Vowel.length; j++) {
				if(word[i].equals(Vowel[j])) {
					VN++;
					break;
				}else if(word[i].equals(blank)) {
					BN++;
					break;
				}else {
					CN++;
					break;
				}
			}
			
		}
		
		System.out.println("주어진 문장의 자음의 갯수 : "+CN);
		System.out.println("주어진 문장의 모음의 갯수 : "+VN);
		System.out.println("주어진 문장의 공백의 갯수 : "+BN);
	}

}
