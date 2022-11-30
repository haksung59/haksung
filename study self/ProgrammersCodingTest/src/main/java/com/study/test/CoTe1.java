package com.study.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CoTe1 {

    public static void main(String[] args) {
        //1부터 n까지의 숫자가 시계방향으로 붙은 스택 n개가 각자의 bottom을 서로 공유하는 자료구조를 만들려 합니다.
        //이 때, 모든 스택이 서로 공유하는 가장 안쪽 공간을 '중앙 공간'이라고 합니다.

        //push(i, x): i번 스택에 정수 x를 젛습니다. 만약 i번 스택을 포함한 모든 스택이 완전히 비어있다면, 중앙공간에 x가 들어가게 됩니다.
        //pop(i): i번 스택의 가장 바깥에 있는 원소를 제거합니다.

        int n = 3;
        int[][] qu = {{1,4}, {2,2}, {1,3}, {1,6}, {3,-1}, {2,-1}};

        System.out.println(solution(n, qu));

    }

    public static int[] solution(int n, int[][] queries) {
        int[] answer = {};
        int queriesLength = queries.length;

        List<Integer>[] stacks = new List[n];
        List<Integer> resultList = new ArrayList<>();

        for(int i=0; i<queriesLength; i++){
            if(i==0){
                for(int j=0; j<queriesLength; j++) {
                    stacks[j].add(queries[i][0]);
                }
                continue;
            }

            if(queries[i][1]==-1){
                resultList.add(queries[i][0]);
                if(stacks[queries[i][0]].size() == 1 ){
                    for(int j=0; j<queriesLength; j++){
                        if(i==n-1 && j==0){
                            stacks[j].remove(0);
                        }else {
                            stacks[j].set(0, queries[i][1]);
                        }
                    }
                }else {
                    int size = stacks[queries[i][0]].size();
                    stacks[queries[i][0]].remove(size-1);
                }
            }else {
                stacks[queries[i][0]].add(queries[i][1]);
            }

        }
        answer = Arrays.stream(resultList.toArray(new Integer[resultList.size()]))
                .mapToInt(Integer::intValue).toArray();

        return answer;
    }

}
