package Level2;

import java.util.*;

class Target_Number {
    public int solution(int[] numbers, int target) {
        int answer = dp(numbers, target, 0, 0);
        return answer;
    }
    public static int dp(int[] numbers, int target, int index, int sum) {
    	// ���ڸ� ������ �� ����� �Ŀ� ��ǥ ���ڿ� ���� ���� ��� 1, �ƴ� ��� 0�� ��ȯ�Ѵ�.
        if(index == numbers.length) {
            if(target == sum) {
                return 1;
            } else {
                return 0;
            }
        }
        // ������ ������� ���� ��� index�� 1 ������Ű��, �� index�� �����ϴ� ���� sum�� ���ϰų� ���ش�.
        return dp(numbers, target, index+1, sum+numbers[index]) +
            dp(numbers, target, index+1, sum-numbers[index]);
    }
}