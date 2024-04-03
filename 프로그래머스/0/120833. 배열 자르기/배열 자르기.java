/*
정수 배열 numbers와 정수 num1, num2
numbers의 num1번째 인덱스부터 num2번째 인덱스까지 자른 정수배열 return
-> int x = 0;
for(int i=num1; i<num2+1; i++){
answer[x] = i;
x++;
}
*/
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int x = 0;
        while(true){
            answer[x] = numbers[num1];
            if(num1 == num2)
                break;
            x++; num1++;
        }
        return answer;
    }
}