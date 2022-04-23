package Level1;

import java.util.*;
class Not_Complete_Player {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> check = new HashMap<>();
        // 이름과 그 이름에 대한 참가자 수를 Hashmap을 통하여 넣어준다.
        // 만약 동명이인이 있으면  그 이름에 대한 참가자 수에 + 1을 해주고 아니면
        // 0에 +1을 해줘야 하므로 getOrDefault를 쓴다.
        for(String s : participant) {
            check.put(s,check.getOrDefault(s,0)+1);
        }
        // 참가자가 도착 시에 그 참가자의 vaule값에서 1을 빼준다
        for(String s : completion) {
            check.put(s,check.get(s) - 1);
        }
        // value값이 0 이 아닌 사람은 도착하지 않은 사람이므로 완주자 명단에 없는 사람이다
        // 따라서 그 값을 출력해준다.
        for(String s : check.keySet()) {
            if(check.get(s) != 0) {
                answer = s;
                break;
            }
        }
        
        return answer;
    }
}
