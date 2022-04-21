package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        // 사람 1,2,3의 정답 규칙
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        
        // 사람마다 맞춘 문제 개수를 위한 배열
        int[] count = new int[3];
        for(int i = 0 ; i < answers.length ; i++) {
            if(answers[i] == person1[i%person1.length]) {
                count[0]++;
            }
            if(answers[i] == person2[i%person2.length]) {
                count[1]++;
            }
            if(answers[i] == person3[i%person3.length]) {
                count[2]++;
            }
        }
        ArrayList<Integer> rank = new ArrayList<Integer>();
        // 가장 많이 맞춘 문제의 개수
        int max = Math.max(Math.max(count[0],count[1]),count[2]);
        
        // 가장 많이 맞춘 사람을 순위에 추가한다.
        if(max == count[0]) {
            rank.add(1);
        }
        if(max == count[1]) {
            rank.add(2);
        }
        if(max == count[2]) {
            rank.add(3);
        }
        Collections.sort(rank);
        // 답 제출을 위한 배열
        answer = new int[rank.size()];
        for(int i = 0 ; i < answer.length ; i++) {
            answer[i] = rank.get(i);
        }
        return answer;
    }
}
