/*
정수 배열 numbers 매개변수
numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값.
-> 가장 작은 수, 그 다음으로 작은 수 
-> 가장 큰 수, 그 다음으로 큰 수
==> 오름차순 정렬 후, 0, 1인덱스 위치 ( 최솟값들 ) | numbers.length-2, numbers.length-1인덱스 위치 ( 최댓값들 )
min = numbers[0] * numbers[1] , max = numbers[numbers.length-2] * numbers[numbers.length-1]
min과 max 비교 -> 큰 값 return
*/
class Solution {
    public int solution(int[] numbers) {
        int answer = 0, min = 0, max = 0;
        
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length-1; j++){
                if(numbers[j]>numbers[j+1]){
                    int tmp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        
        min = numbers[0] * numbers[1];
        max = numbers[numbers.length-2] * numbers[numbers.length-1];
        
        if(min > max) answer = min;
        else answer = max;
        return answer;
    }
}