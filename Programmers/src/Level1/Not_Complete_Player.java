package Level1;

import java.util.*;
class Not_Complete_Player {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> check = new HashMap<>();
        // �̸��� �� �̸��� ���� ������ ���� Hashmap�� ���Ͽ� �־��ش�.
        // ���� ���������� ������  �� �̸��� ���� ������ ���� + 1�� ���ְ� �ƴϸ�
        // 0�� +1�� ����� �ϹǷ� getOrDefault�� ����.
        for(String s : participant) {
            check.put(s,check.getOrDefault(s,0)+1);
        }
        // �����ڰ� ���� �ÿ� �� �������� vaule������ 1�� ���ش�
        for(String s : completion) {
            check.put(s,check.get(s) - 1);
        }
        // value���� 0 �� �ƴ� ����� �������� ���� ����̹Ƿ� ������ ��ܿ� ���� ����̴�
        // ���� �� ���� ������ش�.
        for(String s : check.keySet()) {
            if(check.get(s) != 0) {
                answer = s;
                break;
            }
        }
        
        return answer;
    }
}
