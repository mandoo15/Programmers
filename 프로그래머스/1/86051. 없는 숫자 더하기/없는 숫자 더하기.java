/*
0-9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어진다.
numbers에서 찾을 수 없는 0-9까지 숫자를 모두 찾아 더한 수를 return하라.
ex >
numbers : [1,2,3,4,6,7,8,0] --> 5,9 없음.
return : 5 + 9 ( 14 )

--> HOW?
equals 함수 사용해서 각 배열 index마다 i값이랑 같은지 확인 ( i는 0-9까지 )
있으면 제외, 없으면 i는 더한다. 
*/
class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<10; j++){
                if(numbers[i] == j) answer -= numbers[i];
            }
        }
        return answer;
    }
}