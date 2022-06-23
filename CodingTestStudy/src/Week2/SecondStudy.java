package Week2;
import java.util.*;

public class SecondStudy {

    public static void main(String[] args) {

        System.out.println(solution(6));
    }

    public static int solution(int n) {
        //깊이우선탐색(DFS)
        int answer = 0;

        Stack<P> stack = new Stack<>();
        stack.push(new P(0,0));
        while(!stack.isEmpty()){
            P p = stack.pop();

            if(p.open > n) continue;
            if(p.open < p.close) continue;
            if(p.open + p.close == 2*n) {
                answer ++;
                continue;
            }

            stack.push(new P(p.open+1, p.close));
            stack.push(new P(p.open, p.close+1));
        }

        return answer;
    }

    static class P {
        int open, close;

        public P(int open, int close) {
            this.open = open;
            this.close = close;
        }
    }

}
