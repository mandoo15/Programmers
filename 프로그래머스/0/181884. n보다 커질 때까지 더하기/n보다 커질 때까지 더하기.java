/*
정수 numbers와 정수 n이 매개변수
numbers의 원소를 앞에서부터 하나씩 더하다가 그 합이 n보다 커지는 순간 그전까지의 합을 return
-> while 조건은 n이 answer보다 작을 때,
*/
class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i=0; i<numbers.length; i++){
            answer += numbers[i];
            if(answer > n) break;
        }
        return answer;
    }
}