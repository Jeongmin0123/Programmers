package Level2;

import java.util.*;

class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i = 0 ; i < priorities.length ; i++) {
            pq.add(priorities[i]);
        }
        
        while(!pq.isEmpty()) {
            for(int i = 0 ; i < priorities.length ; i++) {
            	// pq의 맨 앞의 숫자와 priorities의 i번째 항이 같으면서 i의 값과 원하는 위치가 같을 경우
            	// 등수는 1부터 시작하므로 1을 더해준 후에 반환한다.
                if(priorities[i] == pq.peek()) {
                    if(i == location) {
                        answer++;
                        return answer;
                    }
                    // 위 조건을 만족하지 못하는 경우 찾는 값이 아니므로 등수를 1 늘리고 맨 앞의 값을 제거한다.
                    pq.poll();
                    answer++;
                }
            }
        }
        return -1;
    }
}
