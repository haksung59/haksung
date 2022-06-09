package Week1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class secondStudy {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {991, 30, 34, 5, 929}));
    }

    public static String solution(int[] numbers) {
        String answer = IntStream.of(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1,s2)->(s2+s1).compareTo(s1+s2))
                .collect(Collectors.joining());

        if(answer.startsWith("0")) return "0";
        return answer;
    }

}
