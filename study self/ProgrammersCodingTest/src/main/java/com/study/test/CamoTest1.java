package com.study.test;

public class CamoTest1 {

    public static void main(String[] args) {

        int[][] input = {{2,5}, {3,7}, {10,11}};

        System.out.println(solution(input));
    }

    public static int solution(int[][] flowers){
        int answer = 0;
        int flowerAmount =flowers.length;

        int startPoint = 0;
        int beforeEndPoint = 0;

        for(int i=0; i<flowerAmount; i++){
            startPoint = beforeEndPoint > flowers[i][0] ? beforeEndPoint : flowers[i][0];
            if(flowers[i][1] - startPoint > 0) {
                answer += (flowers[i][1] - startPoint);
            }
            beforeEndPoint = flowers[i][1];
        }

        return answer;
    }

}
