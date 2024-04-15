/*
가위 2 바위 0 보 5
순서대로 나타낸 문자열 rsp 매개변수
rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열
이기는 경우
가위 바위
바위 보
보 가위
if rsp[i] = "2" -> "0"
if rsp[i] = "0" -> "5"
if rsp[i] = "5" -> "2"
이런 식으로 !*/
class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length(); i++){
            String x = Character.toString(rsp.charAt(i));
            if(x.equals("2")) answer += "0";
            if(x.equals("0")) answer += "5";
            if(x.equals("5")) answer += "2";
        }
        return answer;
    }
}