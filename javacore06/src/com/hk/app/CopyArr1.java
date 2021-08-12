package com.hk.app;

public class CopyArr1 {

	public static void main(String[] args) {
		
		int[] src = {1,2,3,4,5};
		int[] des = new int[10];
		
		//소스
		for(int i=0; i<src.length; i++)
			System.out.print(src[i]+" ");
		
		//목적지
		System.out.println();
		for(int j=0; j<des.length; j++) {
			System.out.print(des[j]+" ");
		}
		
		System.out.println();
		//System.arraycopy() 설명
		System.arraycopy(src, 1, des, 3, 4);
		for(int j=0; j<des.length; j++) {
			System.out.print(des[j]+" ");
		}
		
		//배열복사
		for(int i=0; i<src.length; i++) {
			des[i] = src[i];
		}
		
		System.out.println();
			for(int j=0; j<des.length; j++) {
				System.out.print(des[j]+" ");
			}
		
		//배열복사(뒤에 5개)
		for(int i=0; i<src.length; i++) {
			des[i+5] = src[i];
		}
		
	}
}
