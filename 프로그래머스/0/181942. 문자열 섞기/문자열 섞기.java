/*
길이가 같은 두 문자열 str1, str2 매개변수
두 문자열의 각 문자가 앞에서부터 서로 번갈아가며 한 번씩 등장하는 문자열을 만들어 return
-> HOW?
1. for문이용 ( str1 길이만큼 반복 )
2. 번갈아서 answer에 저장
*/
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i=0; i<str1.length(); i++){
            String s1 = Character.toString(str1.charAt(i));
            answer += s1;
            String s2 = Character.toString(str2.charAt(i));
            answer += s2;
        }
        return answer;
    }
}