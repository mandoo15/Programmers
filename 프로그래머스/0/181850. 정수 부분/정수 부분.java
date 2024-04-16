/*
실수 flo 매개변수
flo의 정수부분 return
-->HOW?
Math.floor 사용
*/
class Solution {
    public int solution(double flo) {
        int answer = (int) (Math.floor(flo));
        return answer;
    }
}