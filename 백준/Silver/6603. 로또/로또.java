import java.util.*;
import java.io.*;

public class Main {
    static int k; // k
    static int[] s; // 집합
    static int[] results = new int[6];
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            String line = br.readLine();
            if(line == null || line.equals("0")) break; // 입력 끝나면 while루프 탈출
            
            StringTokenizer st = new StringTokenizer(line);
            k = Integer.parseInt(st.nextToken());
           
            s = new int[k];
            for(int i=0; i<k; i++) {
                s[i] = Integer.parseInt(st.nextToken());
            }
            
            check(0, 0); // start, count 뽑기함수 호출
            sb.append("\n");
        }
        System.out.println(sb);
    }
    
    public static void check(int start, int count) {
        if(count == 6) { // 다 뽑으면
            for(int i=0; i<6; i++) {
                sb.append(results[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for(int i=start; i<k; i++) {
            results[count] = s[i];
            check(i+1, count+1);
        }
    }
}