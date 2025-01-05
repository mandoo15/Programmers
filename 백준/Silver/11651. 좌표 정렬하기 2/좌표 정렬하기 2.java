import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언

        int n = Integer.parseInt(br.readLine()); // n 입력받기

        // (x, y) 좌표를 저장할 배열
        int[][] points = new int[n][2];

        // 좌표 입력받기
        for (int i = 0; i < n; i++) {
            String[] values = br.readLine().split(" ");
            points[i][0] = Integer.parseInt(values[0]); // x
            points[i][1] = Integer.parseInt(values[1]); // y
        }

        // Arrays.sort()로 정렬
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                // y값 기준으로 오름차순 정렬
                if (p1[1] != p2[1]) {
                    return Integer.compare(p1[1], p2[1]);
                }
                // y값이 같으면 x값 기준으로 오름차순 정렬
                return Integer.compare(p1[0], p2[0]);
            }
        });

        // 정렬된 결과 출력
        for (int i = 0; i < n; i++) {
            System.out.println(points[i][0] + " " + points[i][1]);
        }
    }
}