import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<tangerine.length; i++) {
            int size = tangerine[i];

            map.put(size, map.getOrDefault(size, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        
        for (Map.Entry<Integer, Integer> entry : list) {
            k -= entry.getValue();
            answer++;

            if (k <= 0) break;
        }
        
        return answer;
    }
}