class Solution {
    public int solution(int[] sides) {
        int answer = 2, max = 0, sum = 0;
        if(sides[0] > max) max = sides[0];
        if(sides[1] > max) max = sides[1];
        if(sides[2] > max) max = sides[2];
        sum = sides[0] + sides[1] + sides[2] - max;
        if(max < sum) answer = 1;
        return answer;
    }
}