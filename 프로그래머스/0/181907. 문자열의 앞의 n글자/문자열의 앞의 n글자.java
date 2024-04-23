/*
문자열 my_string과 정수 n이 매개변수일 때
my_string의 앞의 n글자로 이루어진 문자열 return
0부터 n까지만 리턴하라는 말

-> HOW?
substring 이용
*/
class Solution {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(0, n);
        return answer;
    }
}