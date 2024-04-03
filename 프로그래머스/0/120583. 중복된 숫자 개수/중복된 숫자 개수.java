/*
정수 배열 array 정수 n
array에 n이 몇 개 있는지
*/
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] == n) answer++;
        }
        return answer;
    }
}