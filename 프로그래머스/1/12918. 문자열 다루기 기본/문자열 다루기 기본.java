/*
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성되어 있는지 확인해 주는 함수
ex ) s = "a234" False return, "1234" True return
*/
class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length() == 4 || s.length() == 6){
            for(int i=0; i<s.length(); i++){
                int x =(int)(s.charAt(i));
                if(x > 47 && x < 58) {
                    answer = true;
                }
                else{
                    answer = false;
                    break;
                } 
            }
        }
        return answer;
    }
}