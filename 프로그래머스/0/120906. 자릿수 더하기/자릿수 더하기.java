/*
정수 n 매개변수
n의 자리수의 합 return
->
n을 string으로 바꾼 후 split해서 배열에 저장.
다시 정수로 변환해서 answer에 다 더하기.
*/
class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        String[] str = s.split("");
        for(int i=0; i<str.length; i++){
            answer += Integer.parseInt(str[i]);
        }
        return answer;
    }
}