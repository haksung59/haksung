package Week1;

import java.util.Arrays;

public class fourthStudy {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {5,1,3,7}, new int[] {2,2,6,8}));
    }

    public static int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        int index = B.length -1;

        for(int i=A.length-1; i>=0; i--){
            if(A[i] < B[index]){
                index--;
                answer++;
            }
        }

        return answer;
    }

}
