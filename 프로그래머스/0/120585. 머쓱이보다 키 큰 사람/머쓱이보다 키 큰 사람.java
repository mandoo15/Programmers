/*
머쓱이반 친구들 키 정수 배열 array
머쓱이 키 height
머쓱이보다 큰 사람 수 return
- > for문 .
*/
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] > height) answer++;
        }
        return answer;
    }
}