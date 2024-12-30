import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int x = 0;

        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                arr[x] = i;
                x++;
            }
        }
        System.out.println(arr[k - 1]);
    }
}