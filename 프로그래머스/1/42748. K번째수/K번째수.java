/*
배열 array의 i번째 수부터 j번째 수까지 자르고 정렬했을 때 k번째 수 ( 인덱스 아님. )
주어지는 값 : array ( int ) 배열, i, j, k가 담긴 2차원 배열 commands.
ex >
array = {1,5,2,6,3,7,4}; i=2; j=5; k=3;
array의 2에서 5번째 수만 추출하여 그 중 3번째 수를 반환하는 것임.

--> HOW?
주어지는 것
1. array 1차원 정수형 배열
2. 행 ( 최종적으로 도출해야 하는 k값의 개수 ) 열이 있는 2차원 정수형 배열 commands
각 행에는 i, j, k값이 각 인덱스마다 있음.

생각해 보자.
가장 먼저



*/
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] arr = new int[array.length];
        int[] answer = new int[commands.length];
        int arrind = 0;
        
            for(int m=0; m< commands.length; m++){
                for(int n=commands[m][0]-1; n<commands[m][1]; n++){
                    arr[arrind] = array[n];
                    arrind++;
                }
                
                for(int i=0; i<arr.length; i++){
                    for(int j=0; j<arr.length-1; j++){
                        if(arr[j] > arr[j+1]){
                            int tmp = arr[j+1];
                            arr[j+1] = arr[j];
                            arr[j] = tmp;
                        }
                        for(int o=0; o<arr.length; o++){
                            if(arr[o] > 0){
                                arrind = o;
                                break;
                            }
                        }
                        int k = commands[m][2];
                        answer[m] = arr[arrind+k-1];
                    }
                }
                
                for(int i=0; i<array.length; i++){
                    arr[i] = 0;
                }
                arrind = 0;
            }
        return answer;
    }
}