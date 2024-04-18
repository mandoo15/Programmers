/*
아메리카노와 카페라떼만 판매 각 가겨 4500, 5000 ( 온도 상관 x )
팀원들이 마실 메뉴 적어서 줌 -> 아무거나 : 차가운 아메리카노
각 직원이 적은 메뉴가 문자열배열 order
카페에서 결제하게 될 금액 return

*/
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i=0; i<order.length; i++){
            if(order[i].contains("americano")) answer += 4500;
            if(order[i].contains("cafelatte")) answer += 5000;
            if(order[i].equals("anything")) answer += 4500;
        }
        return answer;
    }
}