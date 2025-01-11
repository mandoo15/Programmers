import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        int cnt = 0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int c = sc.nextInt();

            while (n > 0) {
                if (n > c) {
                    n -= c;
                    cnt++;
                } else {
                    cnt++;
                    n = 0;
                }
            }
            arr[i] = cnt;
            cnt = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}