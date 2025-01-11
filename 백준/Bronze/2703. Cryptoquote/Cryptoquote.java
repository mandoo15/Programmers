import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int t = Integer.parseInt(br.readLine());
        String[] str = new String[t];

        for (int i = 0; i < t; i++) {
            str[i] = "";
            String s1 = br.readLine();
            String s2 = br.readLine();

            for (int j = 0; j < s1.length(); j++) {
                char ch = s1.charAt(j);
                if (ch != ' ') {
                    int x = (int) ch;
                    x = x - 65;
                    str[i] += Character.toString(s2.charAt(x));
                } else {
                    str[i] += " ";
                }

            }
        }

        for (int i = 0; i < t; i++) {
            System.out.println(str[i]);
        }
    }
}