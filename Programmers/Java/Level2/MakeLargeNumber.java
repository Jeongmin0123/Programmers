package Level2;

import java.util.*;

class MakeLargeNumber {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int max = 0;
        for(int i = 0 ; i < number.length() - k ; i++) {
            max = 0;
            // ���� ū ������ i��° ���ڸ� ���ϴ� �˰���
            // ù ��°������ k+1��° ���� �� ���� �ִ밪�� ���ؼ� ���� �� ���ڸ��� �־��ش�.
            // �� ��° ���ڴ� ù��° ���� ���ĺ��� ����Ѵ�.
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
