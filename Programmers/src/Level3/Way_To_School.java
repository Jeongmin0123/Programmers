package Level3;

import java.util.*;

class Way_To_School {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        // �ִ� ����� ������ 1000000007�� ���� �������� return�ϹǷ� �����س��´�.
        int mod = 1000000007;
        int checked[][] = new int[n+1][m+1];
        // �������̰� �ִ� ���� -1�� �ξ� ���꿡 ������ ���� �ʴ´�.
        for(int i = 0 ; i < puddles.length; i++) {
            checked[puddles[i][1]][puddles[i][0]] = -1;
        }
        checked[1][1] = 1;
        for(int i = 1 ; i < n + 1 ; i++) {
            for(int j = 1 ; j < m + 1 ; j++) {
                if(checked[i][j] == -1) continue;
                // ��� ������ ���� ������ �������̰� �ƴϸ� �� ������ ���� �����ش�
                if(checked[i-1][j] > 0) checked[i][j] += checked[i-1][j] % mod;
                if(checked[i][j-1] > 0) checked[i][j] += checked[i][j-1] % mod;
            }
        }
        answer = checked[n][m] % mod;
        return answer;
    }
}
