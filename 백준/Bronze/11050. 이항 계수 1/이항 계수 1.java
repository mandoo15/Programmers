import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a = 1, b = 1, c = 1;
        for (int i = 1; i <= n; i++) {
            a *= i;
        }
        for (int i = 1; i <= k; i++) {
            b *= i;
        }
        for (int i = 1; i <= n - k; i++) {
            c *= i;
        }

        System.out.println((int) ((float) a / (float) (c * b)));
    }
}