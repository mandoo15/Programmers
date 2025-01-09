import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
                str += Character.toLowerCase(s.charAt(i));
            } else {
                str += Character.toUpperCase(s.charAt(i));
            }
        }
        System.out.println(str);
    }
}