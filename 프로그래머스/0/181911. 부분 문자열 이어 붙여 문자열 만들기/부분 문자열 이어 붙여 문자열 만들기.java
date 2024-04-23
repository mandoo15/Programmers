/*
길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수
parts[i] 는 [s, e]형태로 my_strings[i]의 인덱스 s부터 e까지 부분 문자열

my_strings의 원소의 partsㅔ 해당하는 부분문자열을 순서대로 이어붙인 문자열 return
-> for문, substring
*/
class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i=0; i<my_strings.length; i++){
            String s = my_strings[i];
            answer += s.substring(parts[i][0], parts[i][1]+1);
        }
        return answer;
    }
}