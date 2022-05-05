package Level2;

import java.util.*;

public class Function_Development {
	public int[] solution(int[] progresses, int[] speeds) {
        int[] temp = new int[100];
        // ���� ������ ���� �ɸ��� ���� day�� �д�.
        int day = 0;
        // ���� ���� ������ ������ ���� ���� ������ �� �����Ƿ� ���� ���� �����µ� �ɸ� �ð��� ��� �����ϰ� �־�� �Ѵ�.
        for(int i = 0 ; i < progresses.length ; i++) {
            while(progresses[i] + (speeds[i] * day) < 100) {
            	day++;
            }
            temp[day]++;
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0 ; i < 100 ; i++) {
            if(temp[i] != 0) {
                arr.add(temp[i]);
            }
        }
        int[] answer = new int[arr.size()];
        for(int i = 0 ; i < answer.length ; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
