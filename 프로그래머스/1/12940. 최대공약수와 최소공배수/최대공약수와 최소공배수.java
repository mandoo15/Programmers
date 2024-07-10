class Solution {
    public int[] solution(int n, int m) {
        int max = 1, min = 1, i = 2;
        if(n>m){
                while(true){
                    if(m%i==0 && n%i==0){
                        max *= i;
                        n = n/i;
                        m = m/i;
                    }
                    else {
                        i++;
                        if(i>m) break;
                    }
                }
            min = max * n * m;
            }
        if(m>n) {
                while(true){
                    if(n%i==0 && m%i==0){
                        max = max*i;
                        n = n/i;
                        m = m/i;
                    }
                    else {
                        i++;
                        if(i>m) break;
                    }
                }
            min = max * n * m;
            }
        if(m == n){
            min = n;
            max = n;
        }
        int[] answer = {max, min};
        return answer;
    }
}