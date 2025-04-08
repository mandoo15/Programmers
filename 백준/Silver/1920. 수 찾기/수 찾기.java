import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> nSet = new HashSet<>();
        for(int i=0; i<n; i++) {
            nSet.add(sc.nextInt());
        }
        int m = sc.nextInt();
        for(int i=0; i<m; i++){
           int target = sc.nextInt();
           if(nSet.contains(target)) {
               System.out.println(1);
           }
           else System.out.println(0);
        }
    }
}
