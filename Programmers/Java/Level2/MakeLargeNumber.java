package Level2;

import java.util.*;

class MakeLargeNumber {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int max = 0;
        for(int i = 0 ; i < number.length() - k ; i++) {
            max = 0;
            // 가장 큰 숫자의 i번째 숫자를 구하는 알고리즘
            // 첫 번째연산은 k+1번째 숫자 중 가장 최대값을 구해서 답의 맨 앞자리에 넣어준다.
            // 두 번째 숫자는 첫번째 숫자 이후부터 계산한다.
            for(int j = idx ; j <= k + i ; j++) {
                if(max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    idx = j + 1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}
