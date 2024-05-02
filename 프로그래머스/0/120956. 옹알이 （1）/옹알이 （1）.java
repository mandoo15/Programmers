/*
머쓱이는 태어난지 6개월된 조카를 돌보고 있다.
조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음만 가능 ( 조합 ㅇ )
문자열 배열 babbling이 매개변수
머쓱이의 조카가 발음할 수 있는 단어의 개수 return

-> HOW?
ex ) babbling [aya, yee, u, maa, wyeoo] -> aya만 가능 1 return
babbling [ayaye, uuuma, ye, yemawoo, ayaa] -> yemawoo, yem ayaye, 가능 3 return

-> try1
1. 조카가 발음할 수 있는 문자 배열 str ["aya", "ye", "woo", "ma"]
2. 이중 for문을 이용해 babbling의 각 인덱스 원소에서 str원소를 포함하고 있는가? 포함하고 있다면 그 부분은 공백으로 대체.
3. int cnt = 0;
4. 새로운 for문에서 babbling의 각 인덱스 원소 중 원소가 공백인 것을 체크해 cnt++ 후 return

-> try2
문제 : try1처럼 할 경우, wyeoo의 경우 ye가 지워지면 woo도 지워지게 되는 경우

이런 문제를 해결하려면 어떻게 해야 할까?


*/
class Solution {
    public int solution(String[] babbling) {
        String[] str = {"aya", "ye", "woo", "ma"};
        int i, j, cnt = 0;
        for(i=0; i<str.length; i++){
            for(j=0; j<babbling.length; j++){
                if(babbling[j].contains(str[i])){
                    babbling[j] = babbling[j].replace(str[i], " ");
                }
            }
        }
        
        for(i=0; i<babbling.length; i++){
            System.out.println(babbling[i]);
            if(babbling[i].contains(" ")){
                    babbling[i] = babbling[i].replace(" ", "");
                }
            if(babbling[i] == "") cnt++;
        }
        return cnt;
    }
}