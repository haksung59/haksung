package kr.re.kitri.rxjavademo;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.List;

public class HelloRxJava {
    public static void main (String[] args){
        List<String> favoriteColors = Arrays.asList(
                "red", "pink", "blue", "orange", "brown"
        );

        Observable.fromIterable(favoriteColors)
                .filter(item -> item.length() >= 4)
                //.subscribe(item -> System.out.println(item));
                .subscribe(System.out::println);
    }
}
