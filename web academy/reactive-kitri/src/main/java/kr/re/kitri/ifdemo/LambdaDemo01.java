package kr.re.kitri.ifdemo;

import java.util.Collections;

public class LambdaDemo01 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("main: " + i);
        }
        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("thread: " + i);
            }
        };
        Thread myThread = new Thread(runnable);
        myThread.start();



    }
}
