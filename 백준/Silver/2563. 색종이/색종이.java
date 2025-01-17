import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[100][100];
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = a; j < a + 10; j++) {
                for (int k = b; k < b + 10; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j] == 1)
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
}