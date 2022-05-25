package Level3;

import java.util.*;

class Network {
    public static boolean[] check;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n];
        for(int i = 0 ; i < n ; i++) {
            if(!check[i]) {
                dfs(computers, i, check);
                answer++;
            }
        }
        return answer;
    }
    
    public static void dfs(int[][] computers, int i, boolean[] check) {
        check[i] = true;
        for(int j = 0 ; j < computers.length ; j++) {
            if(computers[i][j] == 1 && i != j && !check[j]) {
                dfs(computers, j, check);
            }
        }
    }
}