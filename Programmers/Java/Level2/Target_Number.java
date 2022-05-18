package Level2;

import java.util.*;

class Target_Number {
    public int solution(int[] numbers, int target) {
        int answer = dp(numbers, target, 0, 0);
        return answer;
    }
    public static int dp(int[] numbers, int target, int index, int sum) {
    	// 숫자를 끝까지 다 계산한 후에 목표 숫자와 합이 같은 경우 1, 아닌 경우 0을 반환한다.
        if(index == numbers.length) {
            if(target == sum) {
                return 1;
            } else {
                return 0;
            }
        }
        // 끝까지 계산하지 않은 경우 index를 1 증가시키고, 그 index에 존재하는 값을 sum에 더하거나 빼준다.
        return dp(numbers, target, index+1, sum+numbers[index]) +
            dp(numbers, target, index+1, sum-numbers[index]);
    }
}