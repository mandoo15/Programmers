/*
정수 배열 date1, date2 주어짐. 각각 날짜를 나타냄 [year, month, day]꼴로 주어짐.

만약 date1이 date2보다 앞서는 날짜면 1 아니면 0 return
-> HOW?
연도 크기 비교 : 더 작은 게 큰 거임.
연도의 크기가 같다면?
    월 크기 비교 : 더 작은 게 큰 거임.
    월의 크기가 같다면?
        날짜 크기 비교 : 더 작은 게 큰 거임.
*/
class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        if(date1[0] < date2[0]) answer = 1;
        
        if(date1[0] == date2[0]){
            if(date1[1] < date2[1]) answer = 1;
            
            if(date1[1] == date2[1]){
                if(date1[2] < date2[2]) answer = 1;
            }
        }
        
        return answer;
    }
}