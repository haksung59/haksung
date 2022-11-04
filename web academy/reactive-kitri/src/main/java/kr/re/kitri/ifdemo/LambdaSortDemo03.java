package kr.re.kitri.ifdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaSortDemo03 {
    public static void main(String[] args) {
        List<String> favoriteColors =
                Arrays.asList("red", "Blue", "white", "Orange", "tan");
        System.out.println("before: " + favoriteColors);

        favoriteColors.sort((o1, o2) -> o1.length() - o2.length());

        System.out.println("after: " + favoriteColors);
    }
}




