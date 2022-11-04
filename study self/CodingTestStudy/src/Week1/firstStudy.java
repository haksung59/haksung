package Week1;

public class FirstStudy {

    public static void main(String[] args) {
        System.out.println(solution(20,new int[]{2,5,14},2));
    }

    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        int si = 0;
        int position = 1;
        while(position <= n){
            if(si<stations.length && stations[si] - w <= position){
                position = stations[si] + w + 1;
                si ++;
            } else {
                answer++;
                position += w*2+1;
            }
        }

        return answer;
    }

}
