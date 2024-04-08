/*
행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 열의 값을 서로 더한 결과.
2개의 행렬 arr1 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수를 만들어라.
--> 
행렬 두 개는 행과 열의 크기가 같다.
ex >
1 2  3 4
2 3  5 6
1 2  3 4

1+3 2+4
2+5 3+9
1+3 2+4
*/
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length; i++){ // 행
            for(int j=0; j<arr1[0].length; j++){ // 열
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}