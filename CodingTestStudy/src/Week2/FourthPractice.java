package Week2;

import java.util.*;

public class FourthPractice {

    public static void main(String[] args) {

        String[][] input = new String[][] {{"crow_mask", "hi"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(solution(input));

    }

    public static int solution(String[][] clothes) {
        int answer = 0;

        int length = clothes.length;

        Map<String, Integer> kindMap = new HashMap<String, Integer>();
        List<String> keyList = new ArrayList<String>();

        for(int i=0; i<length; i++) {
            String key = clothes[i][1];
            if(kindMap.containsKey(key)){
                kindMap.put(key, kindMap.get(key)+1);
            }else {
                kindMap.put(key, 1);
                keyList.add(key);
            }
        }
        int combination = 1;
        for(String key : keyList) {
            combination *= (kindMap.get(key)+1);
        }

        answer += combination-1;

        return answer;
    }

}
