/*
두 정수 a, b / boolean 변수 flag 매개변수
flag이 true면 a+b false면 a-b return
-> if
*/
class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag==true) answer = a+b;
        if(flag==false) answer = a-b;
        return answer;
    }
}