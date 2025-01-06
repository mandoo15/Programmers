import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x, ans = 0;
        for (int i = 0; i < 5; i++) {
            x = sc.nextInt();
            ans += x * x;
        }
        System.out.println(ans % 10);
    }
}