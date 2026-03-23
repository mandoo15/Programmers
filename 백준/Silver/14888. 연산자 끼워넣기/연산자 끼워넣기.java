import java.util.*;
import java.io.*;

public class Main {
    static int max = -1000000000;
    static int min = 1000000000; // 결과
    static int[] arr;
    static int[] cal = new int[4]; //사칙연산
    static int n;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine()); 
        arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++) {
            cal[i] = Integer.parseInt(st.nextToken());
        }
        
        check(0, arr[0]);
        
        System.out.println(max + "\n" + min);
    }
    
    public static void check(int count, int sum) {
        if(count == n - 1) {
            if(sum > max) max = sum;
            if(sum < min) min = sum;
            return;
        }
        
        for (int i = 0; i < 4; i++) {
            if (cal[i] > 0) {
                cal[i]--; // 사용

                if (i == 0) check(count + 1, sum + arr[count + 1]);
                else if (i == 1) check(count + 1, sum - arr[count + 1]);
                else if (i == 2) check(count + 1, sum * arr[count + 1]);
                else if (i == 3) check(count + 1, sum / arr[count + 1]);

                cal[i]++; // 백트래킹
            }
        }
    }
}