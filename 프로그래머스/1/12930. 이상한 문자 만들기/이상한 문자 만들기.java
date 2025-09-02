class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder(); // 코드 효율성 개선
        
        int cnt = 0;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != ' ') {
                if(cnt%2==0) {
                    answer.append(Character.toString(Character.toUpperCase(s.charAt(i))));
                    cnt++;
                }
                else {
                    answer.append(Character.toString(Character.toLowerCase(s.charAt(i))));
                    cnt++;
                }
            }
            else {
                cnt = 0;
                answer.append(Character.toString(s.charAt(i)));
            }
        }
        
        return answer.toString();
    }
}