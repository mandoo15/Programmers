class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                for(int k=j+1; k<number.length; k++){
                    int a = number[i];
                    int b = number[j];
                    int c = number[k];
                    if(a+b+c == 0) answer++;
                }
            }
        }
        return answer;
    }
}