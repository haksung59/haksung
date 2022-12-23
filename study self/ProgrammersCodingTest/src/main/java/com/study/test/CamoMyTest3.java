package com.study.test;

import java.util.*;

public class CamoMyTest3 {

    public static void main(String[] args) {

        int N = 22;
        String S = "1A 3C 2B 20G 5A";
        System.out.println(solution(N, S));

    }

    public static int solution(int N, String S) {
        int answer = 0;
        if(S.equals("")) return N * 2;

        String[] arrBooking = S.split(" ");
        int arrBookingLength = arrBooking.length;

        Map<Integer, List<Integer>> spaceMap = new HashMap<>();

        for(int i=0; i<arrBookingLength; i++){
            int bookingLength = arrBooking[i].length();
            int line = Integer.parseInt(arrBooking[i].substring(0, bookingLength-1));
            int changeInt = (int)arrBooking[i].substring(bookingLength-1).charAt(0)-64;
            int column =  changeInt < 9 ? changeInt : changeInt-1;
            if(spaceMap.containsKey(line)){
                spaceMap.get(line).add(column);
                Collections.sort(spaceMap.get(line));
            }else {
                spaceMap.put(line, new ArrayList<Integer>());
                spaceMap.get(line).add(column);
            }
        }

        for(int i=1; i<=N; i++){
            if(!spaceMap.containsKey(i)){
                answer += 2;
            }else {
                int bookingAmtByLine = spaceMap.get(i).size();
                List<Integer> bookingList = spaceMap.get(i);
                if(bookingAmtByLine == 1){
                    int temp = answer;
                    answer += (bookingList.get(0) == 1 || bookingList.get(0) == 10) ? 2 : 1;
                }else {
                    for(int j=0; j<=bookingAmtByLine; j++){
                        if(j==0){
                            if(bookingList.get(j) < 5) continue;
                            else {
                                answer++;
                            }

                        }else{
                            if(j == bookingAmtByLine){
                                if(bookingList.get(j-1) < 7) {
                                    answer++;
                                }
                            }else if(bookingList.get(j) - bookingList.get(j-1) > 4) {
                                answer ++;
                            }
                        }
                    }
                }
            }
        }

        return answer;
    }

}
