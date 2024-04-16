/*
단어 s의 가운데 글자를 반환하라.
길이가 짝수라면 가운데 두 글자를 반환하면 됨.
-> HOW?
길이가 짝수인지 홀수인지 구분.
- 짝수이면 길이/2, 길이/2+1 반환
- 홀수이면 길이/2+1 반환*/
class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==0){
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        }
        if(s.length()%2==1){
            answer = s.substring(s.length()/2, s.length()/2+1);
        }
        return answer;
    }
}