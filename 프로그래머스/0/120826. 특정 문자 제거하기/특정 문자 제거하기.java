/*
문자열 my_string 문자 letter
my_string에서 letter를 제거한 문자열 return
*/
class Solution {
    public String solution(String my_string, String letter) {
        my_string = my_string.replace(letter, "");
        return my_string;
    }
}