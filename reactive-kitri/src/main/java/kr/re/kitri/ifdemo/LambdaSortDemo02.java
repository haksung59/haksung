package kr.re.kitri.ifdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaSortDemo02 {
    public static void main(String[] args) {
        List<String> favoriteColors =
                Arrays.asList("red", "Blue", "white", "Orange", "tan");
        System.out.println("before: " + favoriteColors);

        favoriteColors.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println("after: " + favoriteColors);
    }
}
