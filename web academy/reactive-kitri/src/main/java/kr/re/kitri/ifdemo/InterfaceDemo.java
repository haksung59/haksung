package kr.re.kitri.ifdemo;

public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int result = MyInterface.subNumber(3, 5);
        System.out.println(result);
    }
}

@FunctionalInterface
interface MyInterface {
    int MY_INT = 3;

    int myFunctionalMethod();

    default int addNumber(int a, int b) {
        aaa();
        return a + b;
    }

    static int subNumber(int a, int b) {
        return a - b;
    }

    private int aaa() {
        return 0;
    }
}
