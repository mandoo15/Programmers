import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int t = 0;
            for (int j = 1; j < x + 1; j++) {
                if (x % j == 0) {
                    t++;
                }
            }
            if (t == 2)
                cnt++;
        }

        System.out.println(cnt);
    }
}