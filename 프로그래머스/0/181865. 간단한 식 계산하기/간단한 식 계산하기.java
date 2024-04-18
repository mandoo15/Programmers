class Solution {
    public int solution(String binomial) {
        String[] str = binomial.split(" ");
        String s = str[1];
        char ch = s.charAt(0);
        int answer = 0;
        
        switch(ch){
            case '+':
                answer = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
                break;
            case '-':
                answer = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
                break;
            case '*':
                answer = Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
                break;
        }
        
        return answer;
    }
}