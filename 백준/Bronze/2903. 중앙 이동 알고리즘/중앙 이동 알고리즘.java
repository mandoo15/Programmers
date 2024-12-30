import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 2;
        int z = 1;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < i; j++) {
                z *= 2;
            }
            x += z;
            z = 1;
        }
        System.out.println(x * x);
    }
}