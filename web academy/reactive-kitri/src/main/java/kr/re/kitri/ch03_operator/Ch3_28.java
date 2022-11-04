package kr.re.kitri.ch03_operator;

import io.reactivex.rxjava3.core.Observable;

import java.time.LocalDate;

public class Ch3_28 {
    public static void main(String[] args) {
        Observable.just("2021-01-01", "2021-05-02", "2021-09-12", "2021-04-03")
                .map(LocalDate::parse)
                .any(dt -> {
                    return dt.getMonthValue() >= 6;
                })
                .subscribe(s -> System.out.println("Received: " + s));
    }
}