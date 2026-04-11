import java.util.*;
import java.io.*;

class Line implements Comparable<Line> { // 선 클래스
    int start, end;
    Line(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    @Override // 정렬 규칙
    public int compareTo(Line o) {
        if(this.start == o.start) {
            return Integer.compare(this.end, o.end);
        }
        return Integer.compare(this.start, o.start);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Line[] lines = new Line[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            lines[i] = new Line(x, y);
        }

        Arrays.sort(lines);

        long totalLength = 0;
        int currentStart = lines[0].start;
        int currentEnd = lines[0].end;

        for (int i = 1; i < N; i++) {
            if (lines[i].start <= currentEnd) {
                currentEnd = Math.max(currentEnd, lines[i].end);
            } 
            else {
                totalLength += (currentEnd - currentStart); 
                currentStart = lines[i].start;
                currentEnd = lines[i].end;
            }
        }
        
        // 최종
        totalLength += (currentEnd - currentStart);

        System.out.println(totalLength);
    }
}