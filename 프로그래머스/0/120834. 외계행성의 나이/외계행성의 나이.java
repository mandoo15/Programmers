/*
머쓱이 엔진고장 ->  PROGRAMMERS - 962
나이 알파벳
a 0 b 1 '''
ex >
23은 cd 51살 fb
나이가 age 매개변수
PROGRAMMER-962식 나이 return 

--> HOW?
String[] x라는 배열에 숫자를 문자로 바꿔 줄 알파벳들을 각 인덱스에 집어넣음. (인덱스 번호가 알파벳으로 바꾼 거랑 같음 )
age를 string으로 변환해서 split("")해서 새로운 배열 ( str )에 저장.
*/
import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {
        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
    }
}