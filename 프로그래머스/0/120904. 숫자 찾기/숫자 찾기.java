/* 숫자 찾기
정수 num과 k 매개변수
num을 이루는 숫자 중 k가 있으면 num의 그 숫자가 있는 자리수 return 없으면 -1 return
-> HOW?
num을 string으로 변경
for문 이용해서 num[i]가 k와 같으면 i+1 answer에 저장 후 break
*/
class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String s = Integer.toString(num);
        String[] str = s.split("");
        for(int i=0; i<str.length; i++){
            if(str[i].equals(Integer.toString(k))){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}