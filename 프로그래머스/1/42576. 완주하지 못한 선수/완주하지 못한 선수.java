import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>(); // participant
        
        for(int i=0; i<participant.length; i++){
            String name = participant[i];
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        for(int i=0; i<completion.length; i++){
            String name = completion[i];
            map.put(name, map.getOrDefault(name, 0) - 1);
        }
        String answer = "";
        for(String key : map.keySet()) {
            if(map.get(key) > 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }
}