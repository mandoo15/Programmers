/*
문자열 my_string 매개변수
my_string 안에 있는 숫자만 골라 오름차순 정렬 -> return

-> HOW?
ex ) my_string : hi12392 -> return : 1 2 2 3 9

1. ArrayList<Integer> arr = new ArrayList<>();
2. for문을 이용해 (int)(my_string.charAt(i))의 크기 비교 // int x = (int)(my_string.charAt(i));
만약 65 <= x && x <= 90 || 97 <= x && x <= 122 가 아니라면 my_string.charAt(i)를 arr에 저장.
3. 새로운 int형 배열 answer에 arr의 값 복사.
*/
import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> arr = new ArrayList<>();
        int x, i, cnt = 0;
        
        for(i=0; i<my_string.length(); i++){
            x = (int)(my_string.charAt(i));
            if(65 <= x && x <= 90 || 97 <= x && x <= 122){
                cnt++;
            }
            else{
                String s = Character.toString(my_string.charAt(i));
                arr.add(Integer.parseInt(s));
            }
        }
        
        int[] answer = new int[my_string.length() - cnt];
        for(i=0; i<answer.length; i++){
            answer[i] = arr.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}