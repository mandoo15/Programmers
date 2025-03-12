class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int x = p.length();
        
        for(int i=0; i<=t.length()-x; i++){
            String s = t.substring(i, i+x);
            long a = Long.parseLong(s);  // int → long 변경 (큰 숫자 대비)
            long b = Long.parseLong(p);
            if(b>=a) answer++;
        }
        return answer;
    }
}