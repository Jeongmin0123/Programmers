package Level2;

import java.util.*;

class Lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int min = 0;
        Arrays.sort(people);
        // 정렬을 통해 사람들의 몸무게를 정렬하고 제일 가벼운 사람과 제일 무거운 사람의 무게합이
        // 구명보트의 제한보다 작으면 두명을 같이 태우고 큰 경우 무거운 사람만을 태운다.
        for(int i = people.length - 1 ; i >= min ; i--) {
            if(people[i] + people[min] <= limit) {
                min++;
                answer++;
            } else {
                answer++;
            }
        }
        return answer;
    }
}
