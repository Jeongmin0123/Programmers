package Level2;

import java.util.*;

class More_Spicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // �޾ƿ� �迭�� ���� ��� �켱���� ť�� �־��ش�.
        // �켱���� ť�� �־��� ��� �ڵ����� ū ���� �� �տ� �־��ش�.
        for(int i = 0 ; i < scoville.length ; i++) {
            pq.offer(scoville[i]);
        }
        // ť�� �� �� ���� K���� ������� ������ �����Ѵ�.
        while(pq.peek() < K) {
        	// ���� �� �����µ� K���� ������� -1�� ��ȯ�Ѵ�.
            if(pq.size() == 1) return -1;
            // ���� �� ���� ������ �����ش�.
            int temp1 = pq.poll();
            int temp2 = pq.poll();
            pq.offer(temp1+2*temp2);
            answer++;
        }
        return answer;
    }
}
