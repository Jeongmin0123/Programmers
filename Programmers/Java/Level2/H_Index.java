package Level2;

import java.util.*;

class H_Index {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i = 0 ; i < citations.length ; i++) {
            // i��° ������ �ο�Ƚ���� ũ�ų� ���� �� ���
            int h = citations.length - i;
            // ���� i��° ���� �ο�Ƚ���� h���� Ŀ���� ��������
            if(citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}
