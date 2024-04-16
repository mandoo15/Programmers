/*
정수로 이루어진 리스트 num_list
num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return
--> HOW?
num_list를 오름차순 정렬한 다음에 0-4까지 for문 해서 answer에 값 저장.
*/
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        for(int i=0; i<num_list.length; i++){
            for(int j=0; j<num_list.length - 1; j++){
                if(num_list[j] > num_list[j+1]){
                    int tmp = num_list[j+1];
                    num_list[j+1] = num_list[j];
                    num_list[j] = tmp;
                } 
            }
        }
        for(int i=0; i<5; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}