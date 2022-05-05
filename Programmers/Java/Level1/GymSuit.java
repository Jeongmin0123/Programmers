package Level1;

import java.util.*;

class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {
    	// 맨 처음에 들을 수 있는 학생의 수는 전체에서 안 가져온 학생의 수이다.
        int answer = n - (lost.length);
        Arrays.sort(lost);
        Arrays.sort(reserve);
        // 가져오지 않은 사람이 여분의 옷이 있다면 그 사람은 논외로 하고 들을 수 있는 학생수를 증가시킨다.
        for(int i = 0 ; i < lost.length ; i++) {
            for(int j = 0 ; j < reserve.length ; j++) {
                if(lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }
        // 논외인 학생을 제외하고 빌릴 수 있는 학생의 경우에는 들을 수 있는 학생수를 증가시키고 논외로 바꾼다.
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
