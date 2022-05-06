function solution(s) {
    var len = s.length;
    var min = s.length;
    // 문자열의 길이의 반까지만 연산을 진행한다. 그 이후는 압축이 불가능하므로
    for(var i = 1 ; i <= parseInt(len/2) ; i++) {
        var str = "";
        // 반복되는 문자의 개수
        var count = 1;
        for(var j = 0 ; j - i <= s.length ; j += i) {
        	// i개 단위로 끊은 두 문자열을 비교한다.
            var temp1 = s.substr(j,i);
            var temp2 = s.substr(j+i,i);
            // 둘이 같으면 반복되는 문자의 개수를 하나 증가시킨다
            if(temp1 == temp2) {
                count++;
            } else {
            	// 반복되는 문자가 없는 경우 그냥 추가한다.
                if(count == 1) {
                    str = str + temp1;
                } else {
                	// 반복되는 문자가 있는 경우 앞에 몇번 반복되는지 쓴 후에 문자를 추가한다.
                    str = str + count + temp1;
                }
                count = 1;
            }
        }
        min = Math.min(min, str.length)
    }
    var answer = min;
    return min;
}