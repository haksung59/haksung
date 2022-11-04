package Week2;

public class ThirdPractice {
    public static void main(String[] args) {

        int[][] input = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};

        System.out.println(solution(input));

    }

    public static int solution(int[][] triangle) {
        int answer = 0;
        int length = triangle.length;

        int[] sum = new int[triangle[length-1].length];

        for(int i=0; i<length; i++) {
            if(i==0) {
                sum[0] = triangle[0][0];
                continue;
            }

            int innerLength = triangle[i].length;
            int[] temp = new int[innerLength];

            for(int j=0; j<innerLength; j++) {

                if(j==0) {
                    temp[j] = sum[0]+triangle[i][j];
                }else if(j==innerLength-1) {
                    temp[j] = sum[j-1]+triangle[i][j];
                }else {
                    if(sum[j-1]>sum[j]) {
                        temp[j] = sum[j-1]+triangle[i][j];
                    }else {
                        temp[j] = sum[j]+triangle[i][j];
                    }
                }
            }
            for(int j=0; j<innerLength; j++) {
                sum[j] = temp[j];
            }

        }

        int max = 0;
        for(int m:sum) {
            if(m>max) max = m;
        }
        answer = max;

        return answer;
    }
}
