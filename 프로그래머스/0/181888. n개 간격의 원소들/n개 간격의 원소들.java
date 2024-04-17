// num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int x = 0;
        for(int i=0; i<num_list.length; i+=n){
            answer[x] = num_list[i];
            x++;
        }
        int[] arr = new int[x];
        for(int i=0; i<x; i++){
            arr[i] = answer[i];
        }
        return arr;
    }
}