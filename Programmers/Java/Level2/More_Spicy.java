package Level2;

import java.util.*;

class More_Spicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // 받아온 배열의 값을 모두 우선순위 큐에 넣어준다.
        // 우선순위 큐에 넣어줄 경우 자동으로 큰 수를 맨 앞에 넣어준다.
        for(int i = 0 ; i < scoville.length ; i++) {
            pq.offer(scoville[i]);
        }
        // 큐의 맨 앞 값이 K보다 작은경우 연산을 진행한다.
        while(pq.peek() < K) {
        	// 만약 다 섞었는데 K보다 작은경우 -1을 반환한다.
            if(pq.size() == 1) return -1;
            // 앞의 두 값을 꺼내서 섞어준다.
            int temp1 = pq.poll();
            int temp2 = pq.poll();
            pq.offer(temp1+2*temp2);
            answer++;
        }
        return answer;
    }
}
