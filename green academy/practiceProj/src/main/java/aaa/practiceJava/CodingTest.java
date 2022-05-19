package aaa.practiceJava;

import java.util.Scanner;

public class CodingTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하시오");
		String input = sc.nextLine();
		
		String[] inputArr = input.split("");
		
		boolean[] numchk = new boolean[inputArr.length];
		
		String[] num = "0123456789".split("");
		
		String inputNum = "";
		String inputAlpha = "";
		
		for(int i=0; i<inputArr.length; i++) {
			for(int j=0; j<num.length; j++) {
				if(inputArr[i].equals(num[j])) {
					numchk[i] = true;
					break;
				}
			}
		}
		
		for(int i=0; i<inputArr.length; i++) {
			if(numchk[i]) {
				inputNum += inputArr[i];
			}else {
				inputAlpha += inputArr[i];
			}
		}
		
		numchk[0] = true;
		
		for(int i=1; i<numchk.length; i++) {
			if(numchk[i-1]) {
				numchk[i] = false;
			}else if(!numchk[i-1]) {
				numchk[i] = true;
			}
		}		
		
		String[] numArr = inputNum.split("");
		String[] alphaArr = inputAlpha.split("");
		
		if(numchk[0]) {
			inputArr[0] = numArr[0];
		}else {
			inputArr[0] = alphaArr[0];
		}
		
		int[] index = new int[numchk.length];
		for(int i=0; i<index.length; i++) {
			index[i] = i/2;
			System.out.println(index[i]);
		}
		
		for(int i=0; i<numchk.length; i++) {
			
			if(numchk[i]) {
				inputArr[i] = numArr[index[i]];
			}
			if(!numchk[i]) {
				inputArr[i] = alphaArr[index[i]];
			}
			
		}
		
		for(int i=0; i<inputArr.length; i++) {
			System.out.print(inputArr[i]);
		}
	}

}
