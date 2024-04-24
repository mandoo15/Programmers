/*
정수가 담긴 배열 numbers와 문자열 direction가 매개변수
배열 numbers의 원소를 direction 방향으로 한 칸씩 회전시킨 배열 return

-> HOW?
ex) numbers : [1,2,3] direction : right -> 오른쪽으로 한칸씩 ;; [3,1,2]
--> 
일단 direction right인지 left인지 판별

어차피 한 칸씩이니까 
*/
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int x = 0;
        if(direction.equals("right")) {
            answer[0] = numbers[numbers.length-1];
            for(int i=0; i<numbers.length-1; i++){
                x++;
                answer[x] = numbers[i];
            }
        }
        
        if(direction.equals("left")) {
            answer[numbers.length-1] = numbers[0];
            for(int i=1; i<numbers.length; i++){
                answer[x] = numbers[i];
                x++;
            }
        }
        
        return answer;
    }
}