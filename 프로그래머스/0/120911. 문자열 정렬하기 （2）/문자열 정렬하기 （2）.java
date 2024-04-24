/*
영어 대소문자로 이루어진 문자열 my_string이 매개변수
my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열 return

-> HOW?
1. 정렬 전 toLowerCase() 함수를 이용하여 모두 소문자로 변경한다.
2. 소문자로 변경된 문자열 my_string을 정렬한다. ( 새로운 문자열 배열 하나 생성해 정렬 함수 -> 다시 문자열로 )
*/

import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        String[] str = my_string.split("");
        Arrays.sort(str);
        for(int i=0; i<str.length; i++){
            answer += str[i];
        }
        return answer;
    }
}