/*
정수 x와 자연수 n을 입력받아 x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 한다.
int cnt = 0, int i =0; // n개 수를 셀 것.
while(true) 이용
answer[i] = x;
x += x;
cnt++;
i++;
if(cnt == n) break;
--> 이렇게 되면 x값 자체가 계속 증가되니 더해지는 x값이 초기값이랑 달라짐.
** 초기 x값을 다른 곳에 저장해야 할 듯.
*/
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long m = x;
        int cnt = 0, i = 0;
        while(true) {
            answer[i] = m;
            m += x; cnt++; i++;
            if(cnt == n) break;
        }
        return answer;
    }
}