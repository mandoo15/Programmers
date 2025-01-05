import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int sum = 0, ind = 0, check = 0;
        int[] arr = new int[N - M + 1];

        if (M == 2) {
            arr[0] = 2;
            sum += 2;
            M += 1;
            ind += 1;
        }
        if (M == 1) {
            M++;
        }
        for (int i = M; i < N + 1; i++) {
            check = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = -1;
                    break;
                }
            }

            if (check == 0) {
                arr[ind] = i;
                sum += i;
                ind++;
            }
        }
        if (ind == 0) {
            System.out.println(-1);
        }

        if (ind != 0) {
            System.out.println(sum);
            System.out.println(arr[0]);
        }
    }
}