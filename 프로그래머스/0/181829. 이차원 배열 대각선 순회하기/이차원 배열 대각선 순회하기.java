/*
2차원 정수 배열 board와 정수 k

i + j <= k 조건을 만족하는 모든 (i, j)에 대한
board[i][j]의 합을 return

how?

주어지는 게 2차원 배열과 정수 k이므로,
이중 for문을 이용해 조건을 만족하는지 체크하고 만족한다면 board의 i, j를 정수 answer에 더하여라.
단 i와 j는 이차원배열 board의 행, 열의 크기보다 작거나 같다.

*/
class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(i+j<=k){
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}