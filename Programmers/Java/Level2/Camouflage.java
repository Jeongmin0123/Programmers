package Level2;

import java.util.*;

class Camouflage {
    public int solution(String[][] clothes) {
    	// 곱의 항등원인 1을 답으로 지정한다.
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < clothes.length ; i++) {
        	// 각각의 의상의 종류에 대해서 그 의상이 있으면 value 값에 1을 더하고 없으면 value값에 1을 넣고 의상의 종류를 key값으로 지정한다.
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