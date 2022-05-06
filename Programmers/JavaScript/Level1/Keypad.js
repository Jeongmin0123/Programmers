// 두 좌표의 거리를 반환한다.
function getDistance(pos, index) {
	return Math.ceil(Math.sqrt(Math.pow(pos[0]-index[0],2) + Math.pow(pos[1]-index[1],2)));
}

function solution(numbers, hand) {
    var answer = '';
    // 왼손과 오른손 위치의 초기값을 설정한다.
    var left = [3,0];
    var right = [3,2];
    for(var i = 0 ; i < numbers.length ; i++) {
    	// 1,4,7은 왼손으로 누르고, 그 자리로 손의 위치를 이동한다.
        if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
            answer += 'L';
            left = [parseInt(numbers[i]/3),0];
        // 2,5,8은 오른손으로 누르고, 그 자리로 손의 위치를 이동한다.
        } else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
            answer += 'R';
            right = [parseInt(numbers[i]/3 - 1),2];
        } else {
        	// 받아온 숫자의 위치를 좌표로 변환한다. 
            var temp = [];
            if(numbers[i] == 0) {
                temp = [3,1];
            } else {
                temp = [parseInt(numbers[i]/3),1];
            }
            // 왼손, 오른손과 원하는 위치의 거리를 비교한다. 
            var right_len = getDistance(right, temp);
            var left_len = getDistance(left, temp);
            if(left_len > right_len) {
                answer += 'R';
                right = temp;
            } else if(right_len > left_len) {
                answer += 'L';
                left = temp;
            } else {
                if(hand == 'right') {
                    answer += 'R';
                    right = temp;
                } else {
                    answer += 'L';
                    left = temp;
                }
            }
        }
    }
    return answer;
}