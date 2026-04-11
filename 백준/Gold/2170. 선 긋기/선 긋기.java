import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = readInt();
        int[][] lines = new int[N][2];

        for (int i = 0; i < N; i++) {
            lines[i][0] = readInt();
            lines[i][1] = readInt();
        }

        Arrays.sort(lines, (a, b) -> {
            if(a[0] == b[0]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });

        long totalLength = 0;
        int currentStart = lines[0][0];
        int currentEnd = lines[0][1];

        for (int i = 1; i < N; i++) {
            if (lines[i][0] <= currentEnd) {
                currentEnd = Math.max(currentEnd, lines[i][1]);
            } 
            else {
                totalLength += (currentEnd - currentStart); 
                currentStart = lines[i][0];
                currentEnd = lines[i][1];
            }
        }
        
        // 최종
        totalLength += (currentEnd - currentStart);

        System.out.println(totalLength);
    }
    
    private static int readInt() throws Exception {
        int c, n = 0;
        boolean negative = false;
        while((c = System.in.read()) <= 32); // 공백 무시
        if (c == '-') {
            negative = true;
            c = System.in.read();
        }
        do {
            n = n * 10 + (c & 15);
        } while((c = System.in.read()) > 47 && c < 58);
        return negative ? -n : n;
    }
}