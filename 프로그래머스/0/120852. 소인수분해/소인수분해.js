function solution(n) {
    var answer = [];
    let x = 0;
    for(let i=2; i<n; i++){
        while(n%i==0){
            answer[x] = i;
            x++;
            n /= i;
        }
    }
    
    if(n!=1) {
        answer[x] = n;
    }
    answer = answer.filter((el, index) => answer.indexOf(el) === index);
    return answer;
}