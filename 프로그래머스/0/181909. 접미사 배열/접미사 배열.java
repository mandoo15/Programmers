/*
어떤 문자열에 대해 접미사는 특정 인덱스부터 시작하는 문자열
ex ) banana : banana, anana, nana, ana, na, a

my_string : 매개변수
my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열?

-> 접미사라는 것은 결국 시작은 달라도 끝이 주어진 문자열의 마지막 인덱스여야 함.
*/
import java.util.*;

class Solution {
    public String[] solution(String s) {
        String[] answer = new String[s.length()];
        String[] str = s.split("");
        for(int i=0; i<str.length; i++){
            s = "";
            for(int j=i; j<str.length; j++){
                s += str[j];
            }
            answer[i] = s;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}