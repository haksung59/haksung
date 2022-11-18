package com.study.level2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test1 {

    public static void main(String[] args) {

        int[] arrA = new int[] {14, 35, 119, 121, 331, 989};
        int[] arrB = new int[] {18, 30, 102, 123, 141, 998};

        System.out.println(solution(arrA, arrB));
    }

    public static int solution(int[] arrayA, int[] arrayB) {
        IntStream arrA = Arrays.stream(arrayA).sorted();
        IntStream arrB = Arrays.stream(arrayB).sorted();

        int gcdA = arrA.reduce(Test1::getGCD).getAsInt();
        int gcdB = arrB.reduce(Test1::getGCD).getAsInt();

        int resultA = check(gcdA, arrayB);
        int resultB = check(gcdB, arrayA);

        return Math.max(resultA, resultB);
    }

    static int getGCD(int min, int max){
        if(max % min == 0) {
            return min;
        }
        return getGCD(max % min, max);
    }

    static int check(int a, int[] arr){
        boolean checkNext = true;
        int i = 0;
        while(checkNext){
            checkNext = arr[i] % a != 0;
            i ++;
            if(i==arr.length) break;
        }
        return checkNext ? a : 0;
    }

}
