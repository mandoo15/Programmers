class Solution {
    public int solution(int a, int b) {
        String s1 = Integer.toString(a) + Integer.toString(b);
        String s2 = Integer.toString(b) + Integer.toString(a);
        int answer = Integer.parseInt(s1);
        
        if(answer < Integer.parseInt(s2)) answer = Integer.parseInt(s2);
        return answer;
    }
}