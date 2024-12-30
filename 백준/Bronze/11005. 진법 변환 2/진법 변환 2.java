import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(Integer.toString(a, x).toUpperCase());
    }
}