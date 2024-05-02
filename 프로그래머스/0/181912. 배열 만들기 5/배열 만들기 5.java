/*
문자열 배열 intStrs 정수 k, s, l 매개변수
intStrs의 원소는 숫자로 이루어져 있음.

배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 골라내 정수로 변환
변환한 정수값이 k보다 큰 값을 담은 배열 return

-> HOW?
1. for문을 이용해 intStrs의 길이만큼 반복
2. substring함수를 이용해 (s, s+l) 인덱스에 포함되는 문자열 골라내기
3. 골라낸 문자열 정수로 변환
4. 만약 정수로 변환한 값이 k보다 크다면? Integer 배열 arr에 저장. ( arr는 ArrayList )
5. arr를 int형 배열 answer에 복사해서 저장.
*/

import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++){
            String st = intStrs[i];
            st = st.substring(s, s+l);
            int x = Integer.parseInt(st);
            if(x>k) arr.add(x);

        }
        
        int[] answer = new int[arr.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}