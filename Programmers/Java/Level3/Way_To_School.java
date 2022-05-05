package Level3;

import java.util.*;

class Way_To_School {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        // 최단 경로의 개수를 1000000007로 나눈 나머지를 return하므로 저장해놓는다.
        int mod = 1000000007;
        int checked[][] = new int[n+1][m+1];
        // 물웅덩이가 있는 곳은 -1로 두어 연산에 영향을 주지 않는다.
        for(int i = 0 ; i < puddles.length; i++) {
            checked[puddles[i][1]][puddles[i][0]] = -1;
        }
        checked[1][1] = 1;
        for(int i = 1 ; i < n + 1 ; i++) {
            for(int j = 1 ; j < m + 1 ; j++) {
                if(checked[i][j] == -1) continue;
                // 어느 지점의 위나 왼쪽이 물웅덩이가 아니면 그 지점의 값을 더해준다
                if(checked[i-1][j] > 0) checked[i][j] += checked[i-1][j] % mod;
                if(checked[i][j-1] > 0) checked[i][j] += checked[i][j-1] % mod;
            }
        }
        answer = checked[n][m] % mod;
        return answer;
    }
}
