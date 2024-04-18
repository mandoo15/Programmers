import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] array = new int[arr.length];
        int x = -1, cnt = 0;
        for(int i=0;i<arr.length; i++){
            if(x != arr[i]) {
                x = arr[i];
                array[cnt] = arr[i];
                cnt++;
            }
        }
        
        int[] answer = new int[cnt];
        
        for(int i=0; i<cnt; i++){
            answer[i] = array[i];
        }

        return answer;
    }
}