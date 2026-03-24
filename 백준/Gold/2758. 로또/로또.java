import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int t = Integer.parseInt(br.readLine()); // 테스트케이스
        
        String line = br.readLine();
        if(line == null) return;
        int t = Integer.parseInt(line);
        // 오류 방지를 위해서 미리 체크하는 습관 만들기
        
        while(t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
        
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            // memo[남은개수][현재숫자] = 가능한 경우의 수, 넉넉한 크기 설정 +1
            long[][] memo = new long[n+1][m+1];
           
            //첫 번째 숫자 뽑는 경우의수 ( 모두 1가지 )
            for(int j=1; j<=m; j++) memo[1][j] = 1;
            
            // 2번째부터 채우기
            for(int i=2; i<=n; i++) {
                for(int j=1; j<=m; j++) {
                    for(int k=1; k<=j/2; k++) {
                        memo[i][j] += memo[i-1][k];
                    }
                }
            }
            
            long ans = 0;
            for(int j=1; j<=m; j++) ans += memo[n][j];
            System.out.println(ans);
            
        }
    }
}