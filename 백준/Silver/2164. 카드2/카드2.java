import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int head = 0, tail = n;
        while (tail > 1) {
            head = (head + 1) % n;
            arr[(head + tail - 1) % n] = arr[head];
            head = (head + 1) % n;
            tail--;
        }

        System.out.println(arr[head]);
        sc.close();
    }
}