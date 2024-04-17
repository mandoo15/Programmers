/*
길이가 같은 두 1차원 정수 배열 a, b 매개변수
a와 b의 내적을 return
내적 : a[0]*b[0] + a[1]*b[1] + ''' + a[n-1]*b[n-1] (n은 a, b의 길이)

-> HOW?

for(int i=0; i<n; i++){
answer += a[i]*b[i];
}
*/
class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0; i<a.length; i++){
            answer += a[i]*b[i];
        }
        
        return answer;
    }
}