/*
양의 정수 x가 하샤드 수이려면
x의 자릿수의 합으로 x가 나누어져야 한다.
예를 들어
18의 자릿수 합은
1 + 8 = 9, 18은 9로 나누어 떨어지므로 하샤드 수이다.
x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수를 만들어라.
--> 
일단. 받은 문자를 스트링으로 변경해서 자릿수 확인?
아니면,,, 자릿수가 몇 자리 수인지 내가 어케 아노,,,
최대 5자리니까 for문으로 5번 자리수 확인하게 돌리고
만약 나눈 나머지가 그냥 x랑 같으면 break;
이게 나은 듯.
그렇게 해서 나눈 자릿수의 전체 합으로 x를 나눴을 때 나머지가 0이면
x는 하샤드이다.
answer = true or false
*/
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s = Integer.toString(x);
        int mod = 0;
        for(int i=0; i<s.length(); i++){
            mod += Integer.parseInt(s.substring(i,i+1));
        }
        if(x%mod!=0) answer = false;
        return answer;
    }
}