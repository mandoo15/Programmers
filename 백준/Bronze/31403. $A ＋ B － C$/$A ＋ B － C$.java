import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String x = Integer.toString(a);
        String y = Integer.toString(b);
        String z = Integer.toString(c);
        String s = x + y;
        System.out.println(a + b - c);
        System.out.println(Integer.parseInt(s) - c);
    }
}