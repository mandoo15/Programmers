/*
두 배열이 얼마나 유사한지 확인.
s1과 s2가 주어질 때 같은 원소의 개수
*/
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
            for(int i=0; i<s1.length; i++){
                for(int j=0; j<s2.length; j++){
                    if(s1[i].equals(s2[j])) answer +=1;
                }
            }
        return answer;
    }
}