import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);

        System.out.print(sum / 5 + "\n" + arr[2]);

    }
}