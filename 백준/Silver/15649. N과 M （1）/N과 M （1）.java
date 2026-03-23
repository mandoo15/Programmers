import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static boolean[] visited; // 체크, 1부터 N까지 숫자 -> N+1크기
    static int[] results; // 결과
    
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        visited = new boolean[N+1];
        results = new int[M];
        
        check(0); // 체크 함수 호출
    }
    
    public static void check(int count) {
        if(count == M) {
            for(int i=0; i<M; i++) {
                System.out.print(results[i] + " ");
            }
            System.out.println();
            return;
        }
        
        for(int i=1; i<N+1; i++) {
            if(!visited[i]) {
                visited[i] = true; // 사용함
                results[count] = i;
                check(count + 1);
                visited[i] = false;
            }
        }
    }
}