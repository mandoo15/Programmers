import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // 개수 세기
        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }

        // value들만 리스트로 추출
        List<Integer> counts = new ArrayList<>(map.values());

        // value(개수)만 내림차순 정렬
        counts.sort(Collections.reverseOrder());

        int answer = 0;

        // 큰 개수부터 k 줄여나가기
        for (int count : counts) {
            k -= count;
            answer++;
            if (k <= 0) break;
        }

        return answer;
    }
}
