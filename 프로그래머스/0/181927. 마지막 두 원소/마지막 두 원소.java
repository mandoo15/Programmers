// 마지막 원소가 그 전 원소보다 크면 마지막 원소에서 그 전 원소를 뺀 값을
// 마지막 원소가 그 전 원소보다 크지 않다면 마지막 원소를 두배 한 값을 추가해 return

//배열 복사하는 거 있는데 뭐지 -
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }
        
        if(num_list[num_list.length-1] > num_list[num_list.length-2])
            answer[answer.length-1] = num_list[num_list.length-1] - num_list[num_list.length-2];
        else
            answer[answer.length-1] = num_list[num_list.length-1]*2;
        return answer;
    }
}