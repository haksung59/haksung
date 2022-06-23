package Week2;

import java.util.*;

public class FourthStudy {

    public static void main(String[] args) {
        String[][] input = new String[][] {{"crow_mask", "hi"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(solution(input));

    }

    public static int solution(String[][] clothes) {
//        Map<String, Integer> counts = new HashMap<>();

        return Arrays.stream(clothes)
                        .map(c->c[1])
                        .distinct()
                        .map(type->(int)Arrays.stream(clothes).filter(c->c[1].equals(type)).count())
                        .map(c->c+1)
                        .reduce(1, (c,n)-> c * n)-1;

//        for(String[] c : clothes){
//            String type = c[1];
//            counts.put(type, counts.getOrDefault(type, 0)+1);
//        }

//        int answer = 1;
//
//        for(Integer c : counts.values()){
//            answer *= c+1;
//        }

//        answer -= 1;

    }

}
