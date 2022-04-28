package Level2;

import java.util.*;

public class Function_Development {
	public int[] solution(int[] progresses, int[] speeds) {
        int[] temp = new int[100];
        // 일을 끝내는 데에 걸리는 날을 day로 둔다.
        int day = 0;
        // 앞의 일이 끝나기 전까지 뒤의 일은 배포될 수 없으므로 앞의 일을 끝내는데 걸린 시간을 계속 저장하고 있어야 한다.
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
