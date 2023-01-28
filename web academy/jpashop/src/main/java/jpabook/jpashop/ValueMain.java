package jpabook.jpashop;

public class ValueMain {

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = a;

        b = 20;

        System.out.println(a);
        System.out.println(b);
    }

}
