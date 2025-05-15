import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] arr = rank.clone();
        Map<Integer, Integer> map = new HashMap<>(); // 맵 생성
        // 인덱스, 등수 순서
        for(int i=0; i<attendance.length; i++){
            if(attendance[i]) map.put(i, arr[i]);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue()); // 오름차순 정렬
        int cnt = 1; int answer = 0;
        for(Map.Entry<Integer, Integer> entry : entryList) {
            int key = entry.getKey();
            switch(cnt){
                case 1:
                    answer += 10000 * key;
                    break;
                case 2:
                    answer += 100 * key;
                    break;
                case 3:
                    answer += key;
                    break;
                default:
                    break;
            }
            cnt++;
        }
        return answer;
        }
}