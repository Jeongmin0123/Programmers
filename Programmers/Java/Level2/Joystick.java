package Level2;

class Joystick {
    public int solution(String name) {
        int answer = 0;
        // 처음부터 끝까지 갈 때 이동수
        int move = name.length() - 1;
        for(int i = 0 ; i < name.length() ; i++) {
            char temp = name.charAt(i);
            // 각각의 알파벳마다 필요한 조이스틱 횟수
            answer += Math.min(temp - 'A', 'Z' - temp + 1);
            // 연속하는 A의 개수를 구함
            int next = i+1;
            while(next < name.length() && name.charAt(next) == 'A') {
                next++;
            }
            // 순서대로 갔을 때와 일부 지점까지 간 뒤에 뒤로 돌아가는 경우 중 이동수가 적은 것을 택함
            move = Math.min(move, (i*2) + name.length() - next);
            // 순서대로 가는 경우와 처음부터 돌아갈 때 이동수가 적은 것을 택함
            move = Math.min(move, (name.length() - next)*2 + i);
        }
        answer += move;
        return answer;
    }
}
