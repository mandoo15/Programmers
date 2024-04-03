/*
영어 a, e, i, o, u 모음
문자열 my_string -> 모음을 제거한 문자열 return
- >
replace 함수 사용
*/
class Solution {
    public String solution(String my_string) {
        /*String s = "a e i o u", answer = "";
        String[] mo = s.split(" ");
        for(int i=0; i<s.length; i++){
            answer += my_string.replace(mo[i], "");
        }*/
        String answer = "";
        my_string = my_string.replace("a", "");
        my_string = my_string.replace("e", "");
        my_string = my_string.replace("i", "");
        my_string = my_string.replace("o", "");
        my_string = my_string.replace("u", "");
        return my_string;
    }
}