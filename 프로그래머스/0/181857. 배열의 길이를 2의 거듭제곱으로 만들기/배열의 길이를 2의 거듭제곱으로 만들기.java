import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int powerOfTwo = 1;

        // 현재 배열 크기보다 크거나 같은 가장 작은 2의 거듭제곱 찾기
        while (powerOfTwo < n) {
            powerOfTwo *= 2;
        }

        // 새로운 배열 생성 (기본값 0으로 초기화됨)
        int[] answer = new int[powerOfTwo];

        // 원본 배열 복사
        System.arraycopy(arr, 0, answer, 0, n);

        return answer;
    }
}
