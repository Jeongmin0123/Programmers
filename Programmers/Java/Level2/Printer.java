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
            	// pq�� �� ���� ���ڿ� priorities�� i��° ���� �����鼭 i�� ���� ���ϴ� ��ġ�� ���� ���
            	// ����� 1���� �����ϹǷ� 1�� ������ �Ŀ� ��ȯ�Ѵ�.
                if(priorities[i] == pq.peek()) {
                    if(i == location) {
                        answer++;
                        return answer;
                    }
                    // �� ������ �������� ���ϴ� ��� ã�� ���� �ƴϹǷ� ����� 1 �ø��� �� ���� ���� �����Ѵ�.
                    pq.poll();
                    answer++;
                }
            }
        }
        return -1;
    }
}
