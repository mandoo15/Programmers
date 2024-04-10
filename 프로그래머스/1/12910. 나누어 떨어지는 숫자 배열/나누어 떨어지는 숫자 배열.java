/*
array의 각 요소 중 divisor로 나누어 떨어지는 값을 오름차순 정렬한 배열을 반환하라.
만약 divisor로 나누어 떨어지는 수가 하나도 없다면 -1를 배열에 담아 반환하라.
--> HOW?
divisor는 자연수 ( 1 이상 )
알아야 할 것. : 
1. divisor로 나누어 떨어지는 요소의 개수 ( 오름차순 배열의 길이 ) // cnt
2. divisor로 나누어 떨어지는 값 오름차순 배열에 입력. // copyOfRange() 사용
3. 오름차순 배열을 정렬하기 // Arrays.sort() 사용
4. 반환
*/
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] array = new int[arr.length];
        int a = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor == 0) {
                array[a] = arr[i];
                a++; // array index
            } 
        }
        
        int[] answer = {}; // 생성
        if(a!= 0){
            answer = new int[a]; // 길이
            
            for(int i=0; i<a; i++){
                answer[i] = array[i]; // answer에 0을 나누어떨어지는 값 입력
            }
            for(int i=0; i<a-1; i++) // 오름차순 정렬
            for(int j=0; j<a-1-i; j++)
                if(answer[j] > answer[j+1]){
                    int tmp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = tmp;
                }
        }
        else{ // 나누어 떨어지는 값 없을 때
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}