/*
응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 한다. 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순으로 진료 순서를 정한 배열을 return 
숫자 높은 순서대로 카운트 매기기
*/
import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] sorted = emergency.clone();
        Arrays.sort(sorted); // 오름차순
        Map<Integer, Integer> rankMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            rankMap.put(sorted[i], n - i); // 높은 숫자가 1등
        }

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = rankMap.get(emergency[i]);
        }

        return answer;
    }
}