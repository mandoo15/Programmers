import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int min = 1, max = 1;

        for (int i = 2; i <= n; i++) {
            while (n % i == 0 && m % i == 0) {
                min *= i;
                n /= i;
                m /= i;
            }
        }

        max = min * m * n;

        System.out.println(min);
        System.out.println(max);
    }
}