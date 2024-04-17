/*
정수 리스트 num_list
정수 n
num_list를 n번째 원소 이후의 원소들과 n번째까지의 원소들로 나눠 n번째 원소 이후의 원소들을
n번째까지의 원소들 앞에 붙인 리스트를 return
-> HOW?
0-n-1 | n-num_list.length까지
2번째 원소들을 1번째 원소들 앞에 붙여라.
for문 이용
*/
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int ind = 0;
        
        for(int i=n; i<num_list.length; i++){
            answer[ind] = num_list[i];
            ind++;
        }
        
        for(int i=0; i<n; i++){
            answer[ind] = num_list[i];
            ind++;
        }
        return answer;
    }
}