import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                set.add(sum);
            }
        }
        
        int[] answer = new int[set.size()];
        
        int index = 0;
        for (int num : set) {
            answer[index++] = num;
        }
        
        return answer;
    }
}