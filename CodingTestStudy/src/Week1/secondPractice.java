package Week1;

public class SecondPractice {

    public static void main(String[] args) {

//      0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
//
//      예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
//
//      0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
//
//      제한 사항
//      numbers의 길이는 1 이상 100,000 이하입니다.
//      numbers의 원소는 0 이상 1,000 이하입니다.
//      정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
//      입출력 예
//      numbers   return
//      [6, 10, 2]   "6210"
//      [3, 30, 34, 5, 9]   "9534330"
        System.out.println(solution(new int[] {991, 30, 34, 5, 929}));
    }

    public static String solution(int[] numbers) {
        String answer = "";

        int length = numbers.length;
        String[] strNumbers = new String[length];

        for(int i=0; i<length; i++) {
            strNumbers[i] = Integer.toString(numbers[i]);
        }

        for(int i=0; i<length-1; i++) {
            int strNumberslength = strNumbers[i].length();
            int maxIndex = i;
            String max = strNumbers[i];
            for(int j=i+1; j<length; j++) {
                int strNumberslength2 = strNumbers[j].length();
                int l=0;
                if(strNumberslength>strNumberslength2) {
                    for(int k=0; k<strNumberslength2; k++) {
                        int target1 = Integer.parseInt(strNumbers[i].split("")[k]);
                        int target2 = Integer.parseInt(strNumbers[j].split("")[l]);
                        l++;
                        if(target1<target2) {
                            max = strNumbers[j];
                            maxIndex = j;
                            break;
                        }else if(target1>target2) {
                            max = strNumbers[i];
                            maxIndex =i;
                            break;
                        }
                    }
                }else {
                    for(int k=0; k<strNumberslength; k++) {
                        int target1 = Integer.parseInt(strNumbers[i].split("")[k]);
                        int target2 = Integer.parseInt(strNumbers[j].split("")[l]);
                        l++;
                        if(target1<target2) {
                            max = strNumbers[j];
                            maxIndex = j;
                            break;
                        }else if(target1>target2) {
                            max = strNumbers[i];
                            maxIndex =i;
                            break;
                        }
                    }
                }
                strNumbers[maxIndex] = strNumbers[i];
                strNumbers[i] = max;

            }


        }

        for(int i=0; i<length; i++) {
            answer += strNumbers[i];
        }


        return answer;
    }

}
