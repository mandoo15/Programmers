/*
문자열 배열 strArr
모든 원소가 알파벳으로만 이루어져 있을 때, 
배열에서 홀수 번째 인덱스의 문자열은 모든 문자를 대문자로
짝수 번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 반환하는 solution함수를 완성하라.
*/
class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        
        for(int i=0; i<strArr.length; i++){
            if(i%2==0){
                answer[i] = strArr[i].toLowerCase();
            }
            if(i%2==1){
                answer[i] = strArr[i].toUpperCase();
            }
        }
        return answer;
    }
}