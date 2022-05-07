function solution(n, times) {
	// 배열을 정렬한다.
    times.sort((a,b) => a-b);
    var left = 0;
    var right = times[times.length - 1]*n;
    var mid = Math.floor((left+right)/2);
    while(left <= right) {
    	// 배열의 각각 위치에서 소화할 수 잇는 인원수를 반환하여 더해준다.
        var count = times.reduce((result, val) => result + Math.floor(mid/val), 0);
        if(count >= n) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
        mid = Math.floor((left+right)/2);
    }
    return left;
}