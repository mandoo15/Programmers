/*
    매개변수 - 문자열 : my_string --> 소문자, 대문자, 자연수로 구성
    my_string 내에 자연수 합을 return
*/
class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split("[^0-9]+");
        int answer = 0;
        for (String s : str) {
        if (!s.isEmpty()) { // 빈 문자열 방지
            answer += Integer.parseInt(s);
        }
        }   
        return answer;
    }
}