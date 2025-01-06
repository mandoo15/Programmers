import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> col = new ArrayList<>();
        col.add(n);
        while(n>1){
            if(n%2==0) {
                n /=2;
            }
            else {
                n = n*3 + 1;
            }
            col.add(n);
        }
        int[] answer = col.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}