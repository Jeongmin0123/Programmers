function solution(s)
{
    var answer = 0;
    // 문자열에서 하나씩 떼어서 배열에 넣어준다.
    var temp = [];
    for(var i = 0 ; i < s.length ; i++) {
    	// temp의 길이가 0이거나 마지막 문자열이 새로 들어올 문자와 다르면 새 문자를 넣어준다.
        if(temp.length == 0 || temp[temp.length - 1] != s[i]) {
            temp.push(s[i]);
        // 들어올 문자열이 현재 있는 배열의 맨 마지막 값과 같으면 배열의 맨 마지막 값을 빼준다.
        } else if(temp[temp.length - 1] == s[i]) {
            temp.pop();
        }
    }
    if(temp.length == 0) {
        answer = 1;
    }
    console.log(`${answer}`)

    return answer;
}