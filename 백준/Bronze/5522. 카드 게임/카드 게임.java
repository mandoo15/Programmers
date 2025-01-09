import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}