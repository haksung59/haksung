package kr.re.kitri.ch03_operator;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_26 {
    public static void main(String[] args) {
        Observable.just(5, 3, 7, 10, 2, 14)
                .reduce("", (total, next) -> total + (total.equals("") ?
                        "" :
                        ",") + next)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}