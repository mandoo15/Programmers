import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static boolean[] visit;
    static int[] results;
    static StringBuilder sb = new StringBuilder(); // 한 번에 출력
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        
        visit = new boolean[N+1];
        results = new int[N];
        
        check(0); // 호출
        System.out.print(sb); // 결괏값 출력
    }
    
    public static void check(int count) {
        if(count == N) {
            for(int i=0; i<N; i++){
                sb.append(results[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for(int i=1; i<N+1; i++) {
            if(!visit[i]) {
                visit[i] = true;
                results[count] = i;
                check(count + 1);
                visit[i] = false; // 백트래킹
            }
        }
    }
}