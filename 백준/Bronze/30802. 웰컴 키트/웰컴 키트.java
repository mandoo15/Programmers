import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] size = new int[6];

        for (int i = 0; i < 6; i++) {
            size[i] = sc.nextInt();
        }

        int t = sc.nextInt();
        int p = sc.nextInt();
        int sum = 0; // 1번째
        for (int i = 0; i < 6; i++) {
            sum += (size[i] / t) + (size[i] % t > 0 ? 1 : 0);
        }

        System.out.println(sum);
        System.out.println(n / p + " " + n % p);

        sc.close();
    }
}