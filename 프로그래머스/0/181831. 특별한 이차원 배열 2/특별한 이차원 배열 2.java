/*
nxn크기의 이차원 배열 arr 매개변수
조건 : 0 <= i, j < n인 정수 i, j에 대해 arr[i][j] = arr[j][i]인 경우를 만족하면 1 아니면 0 return
-> HOW?
이중 for문과 if문
*/
class Solution {
    public int solution(int[][] arr) {
        int answer = 1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] != arr[j][i]) {
                    answer = 0;
                    break;
                }
            }
        }
        return answer;
    }
}