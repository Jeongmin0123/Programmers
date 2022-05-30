package Level2;

class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for(int h = 3 ; h*h <= (brown+yellow) ; h++) {
            if((brown+yellow) % h == 0) {
                int w = (brown+yellow) / h;
                if((w-2)*(h-2) == yellow) {
                    answer[0] = w;
                    answer[1] = h;
                    break;
                }
            }
        }
        return answer;
    }
}
