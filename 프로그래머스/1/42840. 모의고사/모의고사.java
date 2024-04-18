/*
수포자 삼인방 수학문제 모두 찍음
1번부터 마지막 문제까지 아래처럼
1번 수포자 : 1,2,3,4,5,1,2,3,4,5'''
2번 수포자 : 2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5'''
3번 수포자 : 3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,4,4,5,5,'''

1번부터 마지막 문제까지 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구?
-> 배열에 담아 return
HOW?
1번 - 3번까지 각각의 문제 찍는 규칙을 배열에 저장.
for문으로 1번 2번 3번 모두 비교 후 맞은 개수 카운트 ( 배열에 저장 ) 
이때, 12345 12345 이런 식으로 배열을 계속 반복해서 정답과 비교해야 한다.
어떻게? 
카운트 된 값 비교해서 가장 큰 수 return
만약 같으면 배열에 저장해서 오름차순 정렬

-> 30점. 왜?
생각해 보니, 
*/
class Solution {
    public int[] solution(int[] answers) {
        // 각 수포자들의 찍는 규칙 -> 배열로
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        int[] sum = new int[3];
        int a=0, b=0, c=0;
        
        for(int i=0; i<answers.length; i++){ // 맞은 개수 집계
            if(answers[i] == arr1[a]) sum[0]++;
            if(answers[i] == arr2[b]) sum[1]++;
            if(answers[i] == arr3[c]) sum[2]++;
            a++; b++; c++;
            if(a >= arr1.length) a = 0;
            if(b >= arr2.length) b = 0;
            if(c >= arr3.length) c = 0;
        }
        
        // 맞은 개수로 max값 구하기
        int max = 0, cnt = 0;
        for(int i=0; i<3; i++){
            if(sum[i] > max){
                max = sum[i];
            }
        }
        
        for(int i=0; i<3; i++){
            if(sum[i] == max){
                cnt++;
            }
        }
        
        int[] answer = new int[cnt];
        
        cnt = 0;
        for(int i=0; i<3; i++){
            if(sum[i] == max) {
                answer[cnt] = (i+1);
                cnt++;
            }
        }
        
        return answer;
    }
}