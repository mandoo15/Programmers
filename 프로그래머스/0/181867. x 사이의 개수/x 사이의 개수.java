/*
문자열 myString
myString을 문자 x를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열 return
-> split함수 사용
*/
class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x");
        
        int cnt = 0;
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'x') cnt++;
        }
        
        
        int[] answer = new int[cnt+1];
        for(int i=0; i<str.length; i++){
            answer[i] = str[i].length();
        }
        return answer;
    }
}