/*
로또 6/45(이하 로또)는 1-45까지 숫자 중 6개를 찍어서 맞히는 대표적 복권
로또 순위를 정하는 방식
1 : 6개 번호 모두 일치
2 : 5개 번호 일치
3 : 4개 번호 일치
4 : 3개 번호 일치
5 : 2개 번호 일치
6( 낙첨 ) : 그 외

동생이 로또에 낙서해서 일부 번호 식별 불가. -> 최고 최저 순위를 찾아보려고 한다.
알아볼 수 없는 번호 0
ex >
구매한 로또 번호 6개가 44, 1, 0, 0, 31, 25
당첨 번호 6개 31, 10, 45, 1, 6, 19이면
당첨 가능한 최고 및 최저 순위는?
최고순위 번호 -> 현재 식별 가능한 번호 일치 + 나머지 모르는 번호가 모두 일치할 경우
==> 31, 1, 0, 0 ( 4개 )
최저순위 번호 -> 현재 식별 가능한 번호 일치 + 나머지 모르는 번호가 모두 불일치할 경우
==> 31, 1 ( 2개 )

구매한 로또 번호를 담은 배열 lottos,
당첨 번호를 담은 배열 win_nums
이때 당첨 가능한 최고 순위 및 최저 순위를 순서대로 배열에 담아라. ( 등수 )

** 제한 **
0은 알아볼 수 없는 숫자이다.
0을 제외한 다른 숫자들은 lottos에 2개 이상 담겨있지 않다.
lottos의 원소는 정렬되어 있지 않을 수 있다.
win_nums에는 같은 숫자가 2개 이상 담겨있지 않다.
win_nums의 원소들은 정렬되어 있지 않을 수도 있다.

--> HOW?
1. 일단 for문으로 lottos랑 win_nums에서 현재 lottos배열에서 win_nums배열과 일치하는 수 체크
2. 1.의 for문에서 lottos에서 0의 개수 찾기.
3. 최저 순위(min)는 1의 수만 최고 순위(max)는 1의 수 + 0의 개수
4. min과 max의 개수로 등수 확인하기. ( switch - case 이용 )
*/
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int min = 0, max = 0;
        
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0) max++;
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j]) min++;
            }
        }
        
        max += min;
        
        switch(max){
            case 6:
                answer[0] = 1;
                break;
            case 5:
                answer[0] = 2;
                break;
            case 4:
                answer[0] = 3;
                break;
            case 3:
                answer[0] = 4;
                break;
            case 2:
                answer[0] = 5;
                break;
            default:
                answer[0] = 6;
                break;
        }
        
        switch(min){
            case 6:
                answer[1] = 1;
                break;
            case 5:
                answer[1] = 2;
                break;
            case 4:
                answer[1] = 3;
                break;
            case 3:
                answer[1] = 4;
                break;
            case 2:
                answer[1] = 5;
                break;
            default:
                answer[1] = 6;
                break;
        }
        
        return answer;
    }
}