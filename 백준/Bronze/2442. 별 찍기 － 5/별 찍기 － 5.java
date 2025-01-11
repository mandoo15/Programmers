import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n - (i + 1); j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 2 * i + 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}