package com.hk.java;

public class RandomGraph {

	public static void main(String[] args) {
		
		int[] number = new int[100];
		int[] counter = new int[10];
		
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i] = (int)(Math.random()*10));
		}System.out.println();
		
		//0~9 가 몇번씩 나왔는지 카운트 증가
		for(int i=0; i<number.length; i++) {
			counter[number[i]]++;
		}
		
		for(int i=0; i<counter.length; i++) {
			System.out.println(i+"의 개수 : "+printGraph('■',counter[i])+" "+counter[i]);
		}

	}

	public static String printGraph(char ch,int value) {
		String result = "";
		for(int i=0; i<value; i++) {
			result += ch;
		}
		return result;
	}
	
}
