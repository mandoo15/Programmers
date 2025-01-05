import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = Integer.toString(n);

        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = n % 10;
            n = n / 10;
        }

        Arrays.sort(arr);

        for (int i = arr.length - 1; i > -1; i--) {
            System.out.print(arr[i]);
        }
    }
}