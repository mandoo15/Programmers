import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Set<Integer> seta = new HashSet<>();
        Set<Integer> setb = new HashSet<>();

        for (int i = 0; i < a; i++) {
            seta.add(sc.nextInt());
        }
        for (int i = 0; i < b; i++) {
            setb.add(sc.nextInt());
        }

        int cnt = 0;
        for (int i : seta) {
            if (!setb.contains(i))
                cnt++;
        }
        for (int i : setb) {
            if (!seta.contains(i))
                cnt++;
        }
        System.out.println(cnt);
    }
}