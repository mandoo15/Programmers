/*
정수를 저장한 배열 arr
가장 작은 수를 빼고 나머지 return
단, 리턴하려는 배열이 빈 배열인 경우 배열에 -1 채워 return하라.
ex) arr[1] = {10}, arr[1] = {-1}
-->HOW?
일단, arr길이가 1이면 arr[0] = -1; 하고, returnl
그렇지 않으면, min = arr[0] 설정 후 for문을 돌려 min값 구함.
새로운 for문 - if min = arr[i] 이면 answer에 저장 x
*/
//arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            int[] array = {-1};
            return array;
        }
        else {
            int[] answer = new int[arr.length-1];
            int min = arr[0];
        
            for(int i=0; i<arr.length; i++){
                if(arr[i]<min) min = arr[i];
            }
        
            int x = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] != min) {
                    answer[x] = arr[i];
                    x++;
                }
            }
            
        return answer;
        }
    }
}