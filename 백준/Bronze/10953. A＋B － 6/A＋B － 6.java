import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            String[] str = new String[2];
            str = s.split(",");
            System.out.println(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
        }
    }
}