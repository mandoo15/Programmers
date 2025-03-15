class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int index = 0;

        // 패턴이 문자열 안에 존재하는 동안 반복
        while ((index = myString.indexOf(pat, index)) != -1) {
            answer++;
            index += 1;
        }
        return answer;
    }
}
