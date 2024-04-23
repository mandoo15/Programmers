/*
정수 number와 n, m 매개변수
number가 n의 배수이면서 m의 배수이면 1 아니면 0 return
-> if
*/
class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if(number%n == 0 && number%m == 0) answer = 1;
        return answer;
    }
}