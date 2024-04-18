class Solution {
    public int solution(int a, int b) {
        String s = Integer.toString(a) + Integer.toString(b);
        int answer = Integer.parseInt(s);
        
        if(answer < 2*a*b) answer = 2*a*b;
        return answer;
    }
}