package Week2;

public class SecondPractice {

    public static void main(String[] args) {

        System.out.println(solution(6));
    }

    public static int solution(int n) {
        int answer = 0;

        answer = factorial(2*n)/((factorial(n+1) * factorial(n)));

        return answer;
    }

    public static int factorial(int n) {
        if(n==1) return 1;
        int result = n*factorial(n-1);

        return result;
    }
}
