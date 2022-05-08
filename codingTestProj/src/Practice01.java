import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class Practice01 {

    public static void main(String[] args) {
        System.out.println(solution("aa1+aa2", "AAAA12"));
    }

    public static int solution(String str1, String str2) {
        int answer = 0;

        str1 = removeSpecials(str1).toLowerCase();
        str2 = removeSpecials(str2).toLowerCase();

        String[] str1_2split = str2Split(str1.split(""));
        String[] str2_2split = str2Split(str2.split(""));

        List<String> intersectionList = new ArrayList<String>();
        List<String> sumList = new ArrayList<String>();

        for(int i=0; i<str1_2split.length; i++){
            for(int j=0; j<str2_2split.length; j++){
                if(str1_2split[i].equals(str2_2split[j])){
                    if(!intersectionList.contains(str1_2split[i])){
                        intersectionList.add(str1_2split[i]);
                        break;
                    }
                }
            }
        }

        for(int i=0; i<str1_2split.length; i++){
            if(!sumList.contains(str1_2split[i])) {
                sumList.add(str1_2split[i]);
            }
        }
        for(int i=0; i<str2_2split.length; i++){
            if(!sumList.contains(str2_2split[i])){
                sumList.add(str1_2split[i]);
            }
        }

        for(int i=0; i<intersectionList.size(); i++){
            if(intersectionList.get(i).contains("/")){
                intersectionList.remove(i);
                i--;
            }
        }

        for(int i=0; i<sumList.size(); i++){
            if(sumList.get(i).contains("/")){
                sumList.remove(i);
                i--;
            }
            System.out.println(sumList.get(i));
        }

        int intersectionNum = intersectionList.size();
        int sumNum = sumList.size();

        float operate = (float)intersectionNum/(float)sumNum;

        answer = (int)(operate * 65536);

        return answer;
    }
    public static String[] str2Split(String[] strSplit){

        String[] result = new String[strSplit.length-1];

        for(int i=0; i<strSplit.length-1; i++){
            result[i] = strSplit[i]+strSplit[i+1];
        }

        return result;
    }

    public static String removeSpecials(String str){
        String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
        str =str.replaceAll(match, "/");
        return str;
    }

}