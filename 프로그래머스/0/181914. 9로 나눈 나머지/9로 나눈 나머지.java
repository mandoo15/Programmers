class Solution {
    public int solution(String number) {
        String[] str = number.split("");
        
        int answer = 0;
        
        for(int i=0; i<str.length; i++){
            answer += Integer.parseInt(str[i]);
        }
        answer = answer%9;
        
        return answer;
    }
}