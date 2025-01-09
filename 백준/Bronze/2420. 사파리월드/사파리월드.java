import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long m = sc.nextInt();
        long sum = n - m;
        if (sum < 0) {
            System.out.println(-1 * sum);
        } else {
            System.out.println(sum);
        }
    }
}