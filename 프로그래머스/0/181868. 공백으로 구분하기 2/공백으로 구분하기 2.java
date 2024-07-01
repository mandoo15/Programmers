/*
단어가 공백 하나 이상으로 구분된 문자열 my_string 매개변수
my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열 return
ex > my_string : "i  love you" -> ["i", "love", "you"]

split을 통해 배열로 나눈 뒤, null값이 아닌 경우 다시 새로운 배열에 저장?

*/

import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] str = my_string.split(" ");
        int cnt = 0;
        ArrayList<String> s = new ArrayList<>();
        
        for(int i=0; i<str.length; i++){
            if(!str[i].isEmpty()) {
                s.add(cnt, str[i]);
                cnt++;
            }
        }
        int x = s.size();
        String[] answer = new String[x];
        for(int i=0; i<x; i++){
            answer[i] = s.get(i);
        }
        return answer;
    }
}