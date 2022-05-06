function solution(s) {
    var temp = s.replace(/one/gi, "1");		// 모든 one이라는 영어롤 1로 바꾼다.
    temp = temp.replace(/two/gi, "2");		// 모든 two라는 영어를 2로 바꾼다.
    temp = temp.replace(/three/gi, "3");	// 위와 같이 모든 아래는 각각의 문자를 숫자로 바꿔준다
    temp = temp.replace(/four/gi, "4");		
    temp = temp.replace(/five/gi, "5");		
    temp = temp.replace(/six/gi, "6");		
    temp = temp.replace(/seven/gi, "7");	
    temp = temp.replace(/eight/gi, "8");	
    temp = temp.replace(/nine/gi, "9");		
    temp = temp.replace(/zero/gi, "0");		
    var answer = Number(temp);
    return answer;
}