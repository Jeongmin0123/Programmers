package Level2;

import java.util.*;

class Largest_number {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        // int �迭�� String �迭�� ��ȯ�Ѵ�.
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        // �� ���ڸ� �ٿ��� �� ū ���ڰ� ������ ������ �����Ѵ�.
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return ((o2 + o1).compareTo(o1+o2));
            }
        });
        // ��� ���ڰ� 0���� �Ǿ��ִ� ��� 0�� ��ȯ
        if(arr[0].equals("0")) {
            return "0";
        }
        //���ĵ� ���ڸ� �����ش�.
        for(String temp : arr) {
            answer += temp;
        }
        return answer;
    }
}
