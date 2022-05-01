package Level2;

import java.util.*;

class H_Index {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i = 0 ; i < citations.length ; i++) {
            // i번째 논문보다 인용횟수가 크거나 같은 논문 편수
            int h = citations.length - i;
            // 만약 i번째 논문의 인용횟수가 h보다 커지면 연산종료
            if(citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}
