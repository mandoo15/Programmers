import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        // BFS - 큐 선언, 시간기록
        Queue<Integer> queue = new LinkedList<>();
        int[] time = new int[100001];
        
        queue.offer(n); // 첫 값
        time[n] = 1;
        
        if(n>=k) {
            System.out.println(n-k); 
            return;
        }
        
        while(!(queue.isEmpty())) {
            int current = queue.poll(); // 현재 값
            
            if(current == k){
                System.out.println(time[current] - 1);
                break;
            }
            
            int[] value = {current - 1, current + 1, current * 2};
            
            for (int next : value) {
                if (next >= 0 && next <= 100000 && time[next] == 0) { // 범위 설정
                    queue.offer(next);
                    time[next] = time[current] + 1;
                }
            }
        }
    }
}