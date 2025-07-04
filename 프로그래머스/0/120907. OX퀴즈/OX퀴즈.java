/* 수식이 옳다면 O / 틀리면 X */
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            String s = quiz[i]; // 배열 1개를 문자열에 저장
            String[] str = s.split(" "); // 문자열의 공백을 제거해 배열로 저장
            // ex -> ["3", "-", "4", "=", "-3"] 무조건 길이 5개임
            // -> 인덱스가 1인 부분이 연산자임을 의미
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[2]);
            int ans = Integer.parseInt(str[4]);
            String math = str[1];
            switch(math) {
                case "+":
                    if(x+y == ans) answer[i] = "O";
                    else answer[i] = "X";
                    break;
                case "-":
                    if(x-y == ans) answer[i] = "O";
                    else answer[i] = "X";
                    break;
            }
        }
        return answer;
    }
}