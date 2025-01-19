function solution(n, slicer, num_list) {
    var answer = [];
    let x;
    switch(n){
        case 1:
            x = 0;
            for(let i=0; i<=slicer[1]; i++){
                answer[x] = num_list[i];
                x++;
            }
            break;
        case 2:
            x = 0;
            for(let i=slicer[0]; i<num_list.length; i++){
                answer[x] = num_list[i];
                x++;
            }
            break;
        case 3:
            x = 0;
            for(let i=slicer[0]; i<=slicer[1]; i++){
                answer[x] = num_list[i];
                x++;
            }
            break;
        case 4:
            x = 0;
            for(let i=slicer[0]; i<=slicer[1]; i+=slicer[2]){
                answer[x] = num_list[i];
                x++;
            }
            break;
    }
    return answer;
}