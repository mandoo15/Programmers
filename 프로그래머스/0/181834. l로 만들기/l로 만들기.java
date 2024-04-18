/*
알파벳 소문자로 이루어진 문자열 myString
알파벳 순서에서 l보다 앞서는 모든 문자를 l로 바꾼 문자열 return
-> replace 사용
*/
class Solution {
    public String solution(String myString) {
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) < 'l') {
                myString = myString.replace(myString.charAt(i), 'l');
            }
        }
        return myString;
    }
}