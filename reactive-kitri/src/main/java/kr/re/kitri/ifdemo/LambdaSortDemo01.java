package kr.re.kitri.ifdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaSortDemo01 {
    public static void main(String[] args) {
        List<String> favoriteColors =
                Arrays.asList("red", "Blue", "white", "Orange", "tan");
        System.out.println("before: " + favoriteColors);

        favoriteColors.sort(new MyComparator());
        System.out.println("after: " + favoriteColors);
    }
}

class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}