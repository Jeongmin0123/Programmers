/**
function solution(record) {
    var answer = [];
    // change, enter 등 명령을 저장한다.
    var command = new Array(record.length);
    // id를 저장한다.
    var id = new Array(record.length);
    // id와 닉네임을 연결하여 저장한다.
    var hashmap = new Map();
    for(var i = 0 ; i < record.length ; i++) {
        var temp = record[i];
        var temp_arr = temp.split(" ");
        // 명령어 저장
        command[i] = temp_arr[0];
        // id 저장
        id[i] = temp_arr[1];
        // 명령어가 enter이나 change인 경우 그 id에 대하여 닉네임을 저장한다.
        if(temp_arr[0] == "Enter" || temp_arr[0] == "Change") {
            hashmap.set(temp_arr[1] , temp_arr[2]);
        }
    }
    // 명령어에 따른 값을 출력한다.
    for(var i = 0 ; i < command.length ; i++) {
        var name = hashmap.get(id[i]);
        if(command[i] == "Enter") {
            answer.push(`${name}님이 들어왔습니다.`);
        } else if(command[i] == "Leave") {
            answer.push(`${name}님이 나갔습니다.`);
        }
    }
    return answer;
}
 */