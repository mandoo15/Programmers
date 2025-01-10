import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String[] str = new String[t];

        for (int i = 0; i < t; i++) {
            str[i] = br.readLine();
        }

        for (int i = 0; i < t; i++) {
            while (str[i].contains("()")) {
                str[i] = str[i].replace("()", "");
            }

            if (str[i].length() == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}