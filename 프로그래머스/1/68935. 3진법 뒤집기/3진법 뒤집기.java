class Solution {
    public int solution(int n) {
        // 몫이랑 나머지를 저장할 변수
        int nam = 0;
        
        // 뒤집어진 3진법 저장할 문자열
        String s = "";
        
        // 뒤집어진 3진법 수 도출
        while(n>0) {
            nam = n%3;
            n = n/3;
            s += nam;
        }

        // 10진법으로 변경 0부터 시작
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(s.length() - 1 - i) - '0'; // 맨 끝자리부터
            int sum = 1;
            for (int j = 0; j < i; j++) {
                sum *= 3;
            }
            answer += x * sum;
        }
        return answer;
    }
}