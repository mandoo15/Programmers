import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int ret = 1, max = 1, add = 6;

        int n = sc.nextInt();
        while(true){
            if(n<=max)break;

            max += add;
            add += 6;
            ++ret;
        }

        System.out.println(ret);
        sc.close();
    }
}