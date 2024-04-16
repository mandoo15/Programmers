/*
자연수 n이 주어지면 n의 각 자릿수의 합을 구해 return
ex )
n 123
result 1 + 2 + 3 = 6
--> HOW?
for문으로 n의 길이만큼 반복, string, charAt, parseInt이용해 더하기
아니면 
*/
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String x = Integer.toString(n);
        for(int i=0; i<x.length(); i++){
            answer += Integer.parseInt(Character.toString(x.charAt(i)));
        }

        return answer;
    }
}