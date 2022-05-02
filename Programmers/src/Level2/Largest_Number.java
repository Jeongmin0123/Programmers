package Level2;

import java.util.*;

class Largest_number {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        // int 배열을 String 배열로 변환한다.
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        // 두 숫자를 붙여서 더 큰 숫자가 앞으로 오도록 정렬한다.
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return ((o2 + o1).compareTo(o1+o2));
            }
        });
        // 모든 숫자가 0으로 되어있는 경우 0을 반환
        if(arr[0].equals("0")) {
            return "0";
        }
        //정렬된 숫자를 합쳐준다.
        for(String temp : arr) {
            answer += temp;
        }
        return answer;
    }
}
