import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++){
            String x = br.readLine();
            if(x.length() <= 9 && x.length() >= 6) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        
        System.out.println(sb);
    }
}