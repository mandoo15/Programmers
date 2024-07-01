/*
약수의 개수가 세 개 이상인 수 : 합성수
자연수 n이 매개변수로 주어질 때 n 이하의 합성수 개수를 return

i를 n만큼 반복해서 i의 약수가 3개 이상이면 cnt++;

*/

class Solution {
    public int solution(int n) {
        int cnt = 0, count = 0;
        if(n>3){
            for(int i=4; i<n+1; i++){
                for(int j=1; j<i+1; j++){
                    if(i%j==0) count++;
                }
                if(count>=3) {
                    cnt++;
                    count=0;
                }
            }
        }
        return cnt;
    }
}