/*
가지고 있는 구술의 개수 balls
친구들에게 나누어 줄 구슬 개수 share
balls 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수
*/

class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        for (int i = 1; i <= share; i++) {
            answer *= balls--;
            answer /= i;
        }
        return answer;
    }
}
