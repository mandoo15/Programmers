class Solution {
    public int solution(int[][] dots) {
        // case 1: (0,1) vs (2,3)
        if (isParallel(dots[0], dots[1], dots[2], dots[3])) return 1;

        // case 2: (0,2) vs (1,3)
        if (isParallel(dots[0], dots[2], dots[1], dots[3])) return 1;

        // case 3: (0,3) vs (1,2)
        if (isParallel(dots[0], dots[3], dots[1], dots[2])) return 1;

        return 0;
    }

    // 기울기 비교 대신 cross 곱으로 비교
    private boolean isParallel(int[] a, int[] b, int[] c, int[] d) {
        return (b[1] - a[1]) * (d[0] - c[0]) == (d[1] - c[1]) * (b[0] - a[0]);
    }
}
