/*
알파벳으로 이루어진 문자열 myString과 pat
myString의 연속된 부분 문자열 중 pat이 존재하면 1 아니면 0
-> contains // toUpperCase 또는 toLowerCase이용
*/
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        if((myString.toLowerCase()).contains(pat.toLowerCase())) answer = 1;
        return answer;
    }
}