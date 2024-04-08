/*
자연수 n을 뒤집어 각 자리 숫자를 원소를 가지는 배열 형태로 리턴해 주세요.
ex >
n 12345이면 54321리턴
-->
일단 long형 n을 string으로 변경
string형 배열에 split해서 저장
for int i = 배열.length; i>0; i--해서 각 원소 int형에 입력
return
*/
class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        String[] str = s.split("");
        int[] answer = new int[str.length];
        int x = 0;
        for(int i=str.length-1; i>-1; i--){
            answer[x] = Integer.parseInt(str[i]); 
            x++;
        }
        return answer;
    }
}