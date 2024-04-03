/*
어떤 자연수 제곱 시 나오는 수 = 제곱수
정수 n이 제곱수라면 1, 아니면 2 return
-->
for(int i=1; i<n; i++){
if(i*i == n) {
return 1;
break;
}
}
*/
class Solution {
    public int solution(int n) {
        int answer = 2;
        for(int i=1; i<n; i++){
        if(i*i == n) {
            answer = 1;
            break;
        }
    }
        return answer;
}
}