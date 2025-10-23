import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d); // 오름차순 정렬
        int count = 0;
        
        for (int i = 0; i < d.length; i++) {
            if (budget - d[i] >= 0) { // 예산이 남아있으면
                budget -= d[i];
                count++;
            } else {
                break; // 예산이 부족하면 종료
            }
        }
        
        return count;
    }
}