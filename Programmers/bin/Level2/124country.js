function solution(n) {
    var answer = '';
    // n > 0 일때까지 연산을 계속한다.
    while(n > 0) {
        var temp = 1;
        // 3으로 나눴을 때 나머지가 0인 경우 4를 붙이고, 1이면 1, 2이면 2를 붙인뒤에 원래 숫자에 나머지를 빼준다.
        // 이후 3으로 나눠준다.
        if(n%3 === 0) {
            answer = 4 + answer;
            n = n - 3;
        } else if(n%3 === 1) {
            answer = 1 + answer;
            n -= n%3;
        } else {
            answer = 2 + answer;
            n -= n%3;
        }
        n = n/3;
    }
    return answer;
}