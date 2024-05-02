/*
문자열 myString 매개변수
x를 기준으로 해당 문자열을 잘라내 배열을 만든다.
이후 사전순으로 정렬한 배열 return
-> HOW?

*/
import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        Arrays.sort(arr);
        int x = 0;
        for(int i=0; i<arr.length; i++){
            
            if(arr[i].isEmpty()) x++;
        }
        
        String[] answer = new String[arr.length-x];
        for(int i=0; i<answer.length; i++){
            answer[i] = arr[x];
            x++;
        }
        return answer;
    }
}