/*
암호화된 문자열 cipher
문자열에서 정수 code의 배수 번째 글자만 진짜 암호임.
cipher와 code가 매개변수 -> 해독된 암호 문자열은?
--HOW?
substring을 통해서 code의 배수만? 추출? -> 새로운 문자열 answer에 삽입 */
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=code-1; i<cipher.length(); i+=code){
            answer += cipher.substring(i,i+1);
        }
        return answer;
    }
}