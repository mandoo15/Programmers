class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2]; // [이진변환 횟수, 제거된 0의 수]
        
        while(s.length()>1) { // s의 길이가 1이 될 때까지
            int o = s.length(); // 기존 길이 o(rigin_len)
            s = s.replaceAll("0", ""); // 0 제거
            int n = s.length(); // 새로운 길이 n(ew_len)
            answer[1] += o - n;
            
            // c(n)진법으로 변환하는 과정 시작
            StringBuilder sb = new StringBuilder();
            while(n>0) { // n이 1이 될 때까지
                sb.append(n%2);
                n/=2;
            }
            s = sb.reverse().toString(); // s에 적용
            answer[0]++; // 이진변환 횟수 증가
        }
        return answer;
    }
}