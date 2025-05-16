/* array와 n 매개변수, array에 들어있는 정수 중 n과 가장 가까운 수 return */

import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<array.length; i++){
            if(n-array[i]<0) {
                map.put(array[i], array[i]-n);
            }
            else {
                map.put(array[i], n-array[i]);
            }
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet()); // 리스트 선언
        keySet.sort((o1, o2) -> map.get(o1) - map.get(o2)); // 오름차순 정렬
        
        int answer = keySet.get(0);
        
        return answer;
    }
}