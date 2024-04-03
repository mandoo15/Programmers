/*
정수 배열 numbers
numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값 return
-->
numbers의 원소 중 가장 큰 수(max1), 두 번째(max2)로 큰 수를 찾아라 !
max1 * max2 return 
*/
class Solution {
    public int solution(int[] numbers) {
        int max1 = 0, max2 = 0, index = 0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > max1) {
                max1 = numbers[i];
                index = i;
            }
        }
        numbers[index] = -1;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > max2) max2 = numbers[i];
        }
        return max1*max2;
    }
}