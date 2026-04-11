import java.util.*;
import java.io.*;
// #문제설명
// 동전 N종류, 합이 K가 되는 동전 개수의 최솟값 ( 동전개수 무제한 ? )

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int count = 0;
        int[] dong = new int[N];
        
        for(int i=0; i<N; i++) {
           dong[i] = Integer.parseInt(br.readLine()); // 동전 입력
        }
        
        for(int i=N-1; i>=0; i--) { // 큰것부터
            if(K >= dong[i]) { // 값이 작거나 같아야 함
                count += (K / dong[i]);
                K = K % dong[i];
            }
        }
        
        System.out.println(count);
    }
}