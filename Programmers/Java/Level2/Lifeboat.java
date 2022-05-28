package Level2;

import java.util.*;

class Lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int min = 0;
        Arrays.sort(people);
        // ������ ���� ������� �����Ը� �����ϰ� ���� ������ ����� ���� ���ſ� ����� ��������
        // ����Ʈ�� ���Ѻ��� ������ �θ��� ���� �¿�� ū ��� ���ſ� ������� �¿��.
        for(int i = people.length - 1 ; i >= min ; i--) {
            if(people[i] + people[min] <= limit) {
                min++;
                answer++;
            } else {
                answer++;
            }
        }
        return answer;
    }
}
