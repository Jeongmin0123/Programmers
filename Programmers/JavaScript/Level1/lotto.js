/**
function solution(lottos, win_nums) {
	// 맞힐 수 있는 번호의 최대, 최소 개수
    var max = 0;
    var min = 0;
    for(var i = 0 ; i < lottos.length ; i++) {
    	// 찍은 번호가 당첨 번호 안에 있는 경우 최대 최소의 개수를 모두 늘려준다.
        for(var j = 0 ; j < win_nums.length ; j++) {
            if(lottos[i] === win_nums[j]) {
                max++;
                min++;
                break;
            }
        }
    }
    // 0의 개수만큼 맞힐 수 있는 번호의 최대값을 늘려준다.
    for(var i = 0 ; i < lottos.length ; i++) {
        if(lottos[i] == 0) {
            max++;
        }
    }
    // 등수의 최대 최소
    var rank_max = 0;
    var rank_min = 0;
    // 맞힌 게 2개보다 작으면 6등, 나머지 경우에는 7에서 맞힌 개수를 빼줘 등수를 구한다.
    if(max < 2) {
        rank_max = 6
    } else {
        rank_max = 7-max;
    }
    if(min < 2) {
        rank_min = 6
    } else {
        rank_min = 7-min;
    }
    var answer = [rank_max, rank_min];
    return answer;
}
 */