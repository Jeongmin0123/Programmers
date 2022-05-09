package Level2;

import java.util.*;

class Camouflage {
    public int solution(String[][] clothes) {
    	// ���� �׵���� 1�� ������ �����Ѵ�.
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < clothes.length ; i++) {
        	// ������ �ǻ��� ������ ���ؼ� �� �ǻ��� ������ value ���� 1�� ���ϰ� ������ value���� 1�� �ְ� �ǻ��� ������ key������ �����Ѵ�.
            if(map.containsKey(clothes[i][1])) {
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
            } else {
                map.put(clothes[i][1], 1);
            }
        }
        for(String key : map.keySet()) {
            answer *= (map.get(key) + 1);
        }
        return answer - 1;
    }
}