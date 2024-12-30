import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt();
            if (x == -1) {
                break;
            }
            String s = "";
            int sum = 0;
            for (int i = 1; i < x; i++) {
                if (x % i == 0) {
                    sum += i;
                    s += Integer.toString(i);
                    s += " + ";
                }
            }
            s = s.substring(0, s.length() - 3);
            if (sum == x) {
                System.out.println(x + " = " + s);
            } else {
                System.out.println(x + " is NOT perfect.");
            }
        }
    }
}