/*
정수 배열 arr와 2개의 구간이 담긴 배열 intervals
intervals는 항상 [[a1,b1], [a2,b2]]의 꼴로 주어지며 각 구간은 닫힌 구간.
닫힌 구간은 양 끝값과 그 사이의 값을 모두 포함하는 구간을 의미

배열 arr의 첫 번째 구간에 해당하는 배열과 두 번째 구간에 해당하는 배열을 앞뒤로 붙여 새로운 배열 return

-> ex ) [1,2,3,4,5] | [[1,3],[0,4]] -> [2,3,4,1,2,3,4,5]
1,3 인덱스 사이 추출 : 첫 번재 구간
0,4 인덱스 사이 추룰 : 두 번쨰 구간
이 둘을 잇는다.

-> FOR문 2개 사용하자. 첫 번재 구간 for문, 두 번째 구간 for문
새로운 배열의 길이는 3-1+1 + 4-1+1
*/
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int length = intervals[0][1] - intervals[0][0] + intervals[1][1] - intervals[1][0] + 2;
        int[] answer = new int[length];
        int x = 0;
        for(int i=intervals[0][0]; i<intervals[0][1]+1; i++){
            answer[x] = arr[i];
            x++;
        }
        for(int i=intervals[1][0]; i<intervals[1][1]+1; i++){
            answer[x] = arr[i];
            x++;
        }
        return answer;
    }
}