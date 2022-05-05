/**
    function solution(new_id) {
    var answer ="";
    var id = new_id.toLowerCase()					// 대문자를 소문자로 변환
                        .replace(/[^\w\.\-]/g,'')	// 특수 문자들을 제거
                        .replace(/[\.]{2,}/g,'.')	// .이 두번 이상 연속되면 1번으로 변환
                        .replace(/^\./,'')			// .이 처음에 위치하는 경우 제거
                        .replace(/\.$/,'');			// .이 맨 뒤에 위치하는 경우 제거
    if(!id) {	// 빈 문자열이면 a를 대입
        id = "a";
    }
    if(id.length >= 16) {							// 길이가 16이상인 경우 첫 15개의 문자를 반환
        id = id.slice(0,15).replace(/\.$/,'');
        
    }
    while(id.length <= 2) {
        id = id + id.substr(-1);					// 길이가 2이하면 맨 마지막 문자를 3이 될때까지 반복해서 붙여줌
    }
    answer = id;
    
    return answer;
	}
 */