import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트케이스 개수
        int[] h = new int[t];
        int[] w = new int[t];
        int[] n = new int[t];

        for (int i = 0; i < t; i++) {
            h[i] = sc.nextInt(); // 층 수
            w[i] = sc.nextInt(); // 각 층의 방 개수
            n[i] = sc.nextInt(); // 배정받을 손님 번호
        }

        int[] val = new int[t]; // 결과 저장 배열

        int i = 0;
        while (i < t) {
            boolean found = false;
            int cnt = 0; // cnt는 각 테스트케이스마다 초기화
            for (int j = 1; j <= w[i]; j++) { // 방 번호
                for (int k = 1; k <= h[i]; k++) { // 층 번호
                    cnt++;
                    if (cnt == n[i]) {
                        System.out.println(k * 100 + j); // 층*100 + 방
                        found = true;
                        break;
                    }
                }
                if (found)
                    break;
            }
            i++;
        }

        sc.close();
    }
}