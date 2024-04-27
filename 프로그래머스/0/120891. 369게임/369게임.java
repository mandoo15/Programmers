/*
머쓱이가 쳐야 할 박수 횟수
-> int to String / string형 배열 -> split
3이 있다, 6이 있다, 9가 있다 cnt값 ++;
cnt return
*/
class Solution {
    public int solution(int order) {
        int answer = 0;
        String s = Integer.toString(order);
        String[] str = s.split("");
        for(int i=0; i<str.length; i++){
            int x = Integer.parseInt(str[i]);
            if(x == 3 || x == 6 || x == 9) answer++;
        }
        return answer;
    }
}