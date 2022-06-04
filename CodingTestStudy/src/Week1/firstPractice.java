package Week1;

class firstPractice {

    public static void main(String[] args) {
        System.out.println(solution(20,new int[]{2,5,14},2));
    }

    public static int solution(int n, int[] stations, int w) {
        int answer = 0;

        boolean[] check = new boolean[n];

        int length = stations.length;
        for(int i=0; i<length; i++){
            for(int j=1; j<=n; j++){
                if(stations[i]==j){
                    if(j-w<=0){
                        for(int k=0; k<=j+w-1; k++){
                            check[k] = true;
                        }
                    }else {
                        if(j+w>n) {
                            for(int k=j-w-1; k<n; k++){
                                check[k] = true;
                            }
                        }else {
                            for(int k=j-w-1; k<j+w; k++){
                                check[k] = true;
                            }
                        }
                    }
                    break;
                }
            }
        }

        for(int i=0; i<n; i++){
            if(!check[i]) {
                if(i+w+w>n){
                    for(int j=i; j<n; j++){
                        check[j] = true;
                    }
                    answer++;
                    break;
                }else {
                    for(int j=i; j<i+w+w; j++){
                        check[j] = true;
                    }
                    answer++;
                }
            }
        }
        return answer;
    }
}

