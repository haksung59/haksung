package com.study.test;

public class CamoMyTest2 {

    public static void main(String[] args) {
        int N = 4;
        int[] A = new int[]{1,2,4,4,3};
        int[] B = new int[]{2,3,1,3,1};
        System.out.println(solution(N, A, B));
    }

    public static boolean solution(int N, int[] A, int[] B) {
        int length = A.length;
        if(N > length+1) return false;

        boolean[] checkPath = new boolean[N-1];

        for(int i=0; i<length; i++){
            if(A[i] - B[i] == 1 || A[i] - B[i] == -1){
                checkPath[Math.min(A[i], B[i])-1] = true;
            }
        }

        for(int i=0; i<N-1; i++){
            if(!checkPath[i]) return false;
        }

        return true;
    }

}
