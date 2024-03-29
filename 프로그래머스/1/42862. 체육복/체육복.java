class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        /* 정렬 부분 추가. 근데 왜 정렬하는 거랑 아닌 거랑 차이가 나는 거지?
        => 만약 lost 4 2 6, reserve 3 5 7이라면... ( 원래라면 셋 모두 청강 가능 )
        내가 짠 코드 기준으로 먼저 lost와 reserve의 동일값이 있는지를 찾는다. -> 없음.
        4 -> 3, 5, 7 ( 3 옷 빌림 ) 2 -> -1, 5, 7 ( 없음. ) 6 -> -1, 5, 7 ( 5 옷 빌림 )
        이렇게 되면 원래 3이 더해져야 하는데 실제로 코드값은 2로 나온다. 
        --> 오름차순 정렬 코드가 필요. */
        
        for(int i=0; i<lost.length; i++){ // lost 오름차순 정렬
            for(int j=0; j<lost.length-1; j++){
                if(lost[j] > lost[j+1]){
                    int a = lost[j];
                    lost[j] = lost[j+1];
                    lost[j+1] = a;
                }
            }
        }
        
        for(int i=0; i<reserve.length; i++){ // reserve 오름차순 정렬
            for(int j=0; j<reserve.length-1; j++){
                if(reserve[j] > reserve[j+1]){
                    int a = reserve[j];
                    reserve[j] = reserve[j+1];
                    reserve[j+1] = a;
                }
            }
        }
        
        for(int i=0; i<lost.length; i++){ // 도난 수만큼 반복
            for(int j=0; j<reserve.length; j++){ // 여벌 수만큼 반복
                
                    if(lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                        
                }
            }
        }
        
        for(int i=0; i<lost.length; i++){ // 도난 수만큼 반복
            for(int j=0; j<reserve.length; j++) { // 여벌 수만큼 반복
                
                if(lost[i] > 0 && reserve[j] > 0){
                    if(lost[i]+1 == reserve[j] ||  lost[i]-1 == reserve[j]){
                    reserve[j] = -1; 
                    answer++;
                    break;
                        
                }
                }
            }
        }
        
        return answer;
    }
}