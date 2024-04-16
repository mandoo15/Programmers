/*
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식
ex )
AB 는 1만큼 밀면 BC가 됨. 3만큼 밀면 DE가됨.
z는 1만큼 밀면 a
문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만들어라.
-> HOW?
대문자이면 ASCII코드 A - Z : 65-90
소문자이면 ASCII코드 a - z : 97-122

각 문자가 대문자 소문자인지 판별 후 그 문자의 ASCII코드에 n을 더한 값. -> n만큼 민 문자
단, 문자의 ASCII코드가 90 || 122를 넘긴 수가 나오면 26을 뺀다. ( 알파벳 개수 )

공백의 경우? 
*/
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int asc = (int)(ch), sum = 0;
            if(65<=asc && asc <=90) {
                sum = asc + n;
                if(sum > 90) sum -= 26;
                ch = (char)(sum);
            }
            if(97<=asc && asc <=122) {
                sum = asc + n;
                if(sum > 122) sum -= 26;
                ch = (char)(sum);
            }
               answer += Character.toString(ch);
        }
        return answer;
    }
}