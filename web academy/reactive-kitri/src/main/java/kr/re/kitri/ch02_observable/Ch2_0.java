package kr.re.kitri.ch02_observable;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.List;

public class Ch2_0 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3,4,5,6);

        for (int number: myList) {
            System.out.println(number);
        }

        Observable
                .just("Hello world")
                .subscribe(System.out::println);
    }
}
