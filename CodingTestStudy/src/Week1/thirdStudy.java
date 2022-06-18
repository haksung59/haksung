package Week1;

import java.util.stream.IntStream;

public class ThirdStudy {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {120,110,140,150}, 485));
    }

    public static int solution(int[] budgets, int M) {
        int answer = 0;

        int min = 0;
        int max = IntStream
                .of(budgets)
                .max()
                .orElse(0);

        while(min <= max){
            final int mid = (min + max) /2;

            int sum = IntStream.of(budgets)
                    .map(budget -> Math.min(budget, mid))
                    .sum();
            System.out.println(sum);
            if(sum<=M){
                min = mid +1;
                answer = mid;
            }else {
                max = mid -1;
            }
        }

        return answer;
    }

}
