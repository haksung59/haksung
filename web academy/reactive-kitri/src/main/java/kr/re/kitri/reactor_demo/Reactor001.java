package kr.re.kitri.reactor_demo;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

public class Reactor001 {

    public static void main(String[] args) {
        Flux.just(1,2,3,4,5,6)
               // .subscribeOn(Schedulers.)
                .filter(item -> item >= 3)
                .map(item -> item * 3)
                .subscribe(i -> System.out.println(i + " : " + Thread.currentThread().getName()));
    }
}

class MySubscriber implements Subscriber<Integer> {
    public void onSubscribe(Subscription subscription) {
        System.out.println("구독 시작..");
        subscription.request(3);
    }

    @Override
    public void onNext(Integer i) {
        System.out.println(i + " 데이터 받음");
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {
        System.out.println("complete...");
    }

}