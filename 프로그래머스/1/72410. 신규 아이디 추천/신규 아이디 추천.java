/* 규칙 위반 아이디 -> 유사하면서 규칙 맞는 아이디 추천 */
/*
3자 이상 15자 이하
알파벳 소문자, 숫자, 빼기, 밑줄, 마침표만 사용
마침표는 처음과 끝, 연속 사용 X
*/
import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase(); // 1
        new_id = new_id.replaceAll("[^a-z0-9_.-]", ""); // 2
        new_id = new_id.replaceAll("\\.{2,}", "."); //3
        new_id = new_id.replaceAll("^\\.|\\.$", ""); // 4
        if(new_id.isEmpty()) new_id += "a"; // 5
        if(new_id.length()>15){
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("\\.$", ""); // 6
        }
        if(new_id.length() < 3){
            while(new_id.length()<3) {
                char x = new_id.charAt(new_id.length()-1);
                new_id += x;
            }
        }
    
        return new_id;
    }
}