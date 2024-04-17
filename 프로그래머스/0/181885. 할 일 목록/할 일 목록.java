// 아직 마치지 못한 일들을 순서대로 담은 문자열 배열
// todo_list : 해야 할 일 / finished : 다한 지 판별
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] arr = new String[finished.length];
        int x = 0;
        
        for(int i=0; i<finished.length; i++){
            if(finished[i] == false){
                arr[x] = todo_list[i];
                x++;
            }
        }
        
        String[] answer = new String[x];
        
        for(int i=0; i<x; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}