package Level1;

import java.util.*;

class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {
    	// �� ó���� ���� �� �ִ� �л��� ���� ��ü���� �� ������ �л��� ���̴�.
        int answer = n - (lost.length);
        Arrays.sort(lost);
        Arrays.sort(reserve);
        // �������� ���� ����� ������ ���� �ִٸ� �� ����� ���ܷ� �ϰ� ���� �� �ִ� �л����� ������Ų��.
        for(int i = 0 ; i < lost.length ; i++) {
            for(int j = 0 ; j < reserve.length ; j++) {
                if(lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }
        // ������ �л��� �����ϰ� ���� �� �ִ� �л��� ��쿡�� ���� �� �ִ� �л����� ������Ű�� ���ܷ� �ٲ۴�.
        for(int i = 0 ; i < reserve.length ; i++) {
            for(int j = 0 ; j < lost.length ; j++) {
                if ( (reserve[i] != -1 && lost[j] != -1) ) {
                    if ( reserve[i] - lost[j] == 1 || reserve[i] - lost[j] == -1 ) {
                        reserve[i] = -1; lost[j] = -1; answer += 1;
                    }
                }
            }
        }
        return answer;
    }
}