package com.study.test;

import java.util.*;

public class CamoTest2 {

    public static void main(String[] args) {

        String[] id_list = {"JAY", "JAY ELLE JAY MAY", "MAY ELLE MAY", "ELLE ELLE ELLE", "MAY"};
        int k = 3;
        System.out.println(solution(id_list, k));

    }

    static int solution(String[] id_list, int k){
        int answer = 0;

        int listLength = id_list.length;
        Map<String, Integer> couponById = new HashMap<>();
        List<String> idByList = new ArrayList<>();

        for(int i=0; i<listLength; i++){
            String[] arrId = id_list[i].split(" ");
            HashSet<String> hashSetId = new HashSet<>(Arrays.asList(arrId));
            arrId = hashSetId.toArray(new String[0]);

            int arrIdAmount = arrId.length;
            for(int j=0; j<arrIdAmount; j++){
                if(couponById.containsKey(arrId[j])){
                    int currentCoupon = couponById.get(arrId[j]);
                    couponById.replace(arrId[j], currentCoupon<k ? currentCoupon+1 : k);
                }else {
                    couponById.put(arrId[j], 1);
                    idByList.add(arrId[j]);
                }
            }
        }

        for(String idKey : idByList){
            answer += couponById.get(idKey);
        }

        return answer;
    }

}
