/*
문자열 my_string
정수 num1, num2 매개변수
my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return해라.
-->HOW?
ex)
my_string : hello
num1 : 1
num2 : 2
result : hlelo

substring 이용.
*/



class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0; i<str.length; i++){
            if(i == num1){
                answer += str[num2];
            }
            else if(i == num2) {
                answer += str[num1];
            }
            else {
                answer += str[i];
            }
        }
        return answer;
    }
}