// 쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다.
// 시켜먹은 치킨의 수 chicken이 매개변수, 받을 수 있는 최대 서비스 치킨의 수를 return
class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while(true){
            answer += chicken/10;
            chicken= chicken/10 + chicken%10;
            
            if(chicken<10) break;
        }
        return answer;
    }
}