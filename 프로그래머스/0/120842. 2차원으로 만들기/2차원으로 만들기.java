/*
정수 배열 num_list와 정수 n이 매개변수
num_list를 다음 설명과 같이 2차원 배열로 바꿔 return
ex ) num_list가 [1, 2, 3, 4, 5, 6, 7, 8] - 길이 8 | n - 2
num_list를 2*4 배열로 변경 -> [[1,2], [3,4], [5,6], [7,8]]

행렬 만들 때 2차원 배열 for문으로 계산

*/
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int x = 0;
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[0].length; j++){
                answer[i][j] = num_list[x];
                x++;
            }
        }
        return answer;
    }
}