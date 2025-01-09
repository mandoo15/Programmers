import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] ascending = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] descending = { 8, 7, 6, 5, 4, 3, 2, 1 };

        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int a = 0, b = 0;
        for (int i = 0; i < 8; i++) {
            if (arr[i] == ascending[i]) {
                a++;
            }
            if (arr[i] == descending[i]) {
                b++;
            }
        }

        if (a == 8)
            System.out.println("ascending");
        if (b == 8)
            System.out.println("descending");
        if (a != 8 && b != 8)
            System.out.println("mixed");
    }
}