class Solution {
    /*
    requirement : 전화번호 뒷 4자리를 제외한 나머지 번호는 모두 가려주세요! 
    
    phone_number : 전화번호가 들어있는 문자열. ( 4 <= phone_number <= 20 )
    answer : return할 값.
    전화번호의 뒷 4자리를 제외한 나머지 문자열 부분을 *로 바꿔야 한다.
    How? 
    - > phone_number의 전체 길이 파악.
    - > substring을 이용해 phone_number 뒷 4자리를 추출.
    - > answer에 전체 길이에서 4를 뺀만큼 * append
    - > answer에 추출한 전화번호 뒷자리 4개를 append
    */
    public String solution(String phone_number) {
        int length = phone_number.length();// 전화번호 전체 길이
        String end = phone_number.substring(length-4, length); // 뒷자리 4개
        String answer = "";
        for(int i=0; i<length-4; i++){
            answer += "*";
        }
        answer += end;
        return answer;
    }
}