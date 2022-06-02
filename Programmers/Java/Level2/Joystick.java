package Level2;

class Joystick {
    public int solution(String name) {
        int answer = 0;
        // ó������ ������ �� �� �̵���
        int move = name.length() - 1;
        for(int i = 0 ; i < name.length() ; i++) {
            char temp = name.charAt(i);
            // ������ ���ĺ����� �ʿ��� ���̽�ƽ Ƚ��
            answer += Math.min(temp - 'A', 'Z' - temp + 1);
            // �����ϴ� A�� ������ ����
            int next = i+1;
            while(next < name.length() && name.charAt(next) == 'A') {
                next++;
            }
            // ������� ���� ���� �Ϻ� �������� �� �ڿ� �ڷ� ���ư��� ��� �� �̵����� ���� ���� ����
            move = Math.min(move, (i*2) + name.length() - next);
            // ������� ���� ���� ó������ ���ư� �� �̵����� ���� ���� ����
            move = Math.min(move, (name.length() - next)*2 + i);
        }
        answer += move;
        return answer;
    }
}
