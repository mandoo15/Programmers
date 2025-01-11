import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        if (n >= 1000) {
            for (int x = 0; x < 1001; x++) {
                for (int y = 200; y < 1001; y++) {
                    if (3 * x + 5 * y == n) {
                        sum = x + y;
                        System.out.println(sum);
                        break;
                    }
                }
                if (sum > 0)
                    break;
            }
        } else if (n >= 100) {
            for (int x = 0; x < 201; x++) {
                for (int y = 0; y < 201; y++) {
                    if (3 * x + 5 * y == n) {
                        sum = x + y;
                        System.out.println(sum);
                        break;
                    }
                }
                if (sum > 0)
                    break;
            }
        } else if (n >= 10) {
            for (int x = 0; x < 21; x++) {
                for (int y = 0; y < 21; y++) {
                    if (3 * x + 5 * y == n) {
                        sum = x + y;
                        System.out.println(sum);
                        break;
                    }
                }
                if (sum > 0)
                    break;
            }
        } else {
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    if (3 * x + 5 * y == n) {
                        sum = x + y;
                        System.out.println(sum);
                        break;
                    }
                }
                if (sum > 0)
                    break;
            }
        }

        if (sum == 0)
            System.out.println(-1);
    }
}