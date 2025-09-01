import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(String keys : keymap) { // hash에 최소인덱스값 저장 알파벳별로
            for(int i=0; i<keys.length(); i++){
                char c = keys.charAt(i);
                int charind = i+1;
                
                if(!map.containsKey(c) || charind < map.get(c)) {
                    map.put(c, charind);
                }
            }
        }
        
        int[] answer = new int[targets.length]; // target의 알파벳 1번씩 순회 -> value 합산
        
        for(int i=0; i<targets.length; i++) {
            for(int j=0; j<targets[i].length(); j++) {
                char al = targets[i].charAt(j);
                
                if(!map.containsKey(al)) {
                    answer[i] = -1;
                    break;
                }
                
                answer[i] += map.get(al);
            }
        }
        
        return answer;
    }
}