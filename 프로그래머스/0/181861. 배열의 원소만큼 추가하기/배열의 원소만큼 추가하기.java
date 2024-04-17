class Solution {
    public int[] solution(int[] arr) {
        int[] array = new int[10000];
        int x = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                array[x] = arr[i];
                x++;
            }
        }
        int[] answer = new int[x];
        for(int i=0; i<answer.length; i++){
            answer[i] = array[i];
        }
        return answer;
    }
}