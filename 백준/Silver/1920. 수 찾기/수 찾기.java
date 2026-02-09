import java.io.*;
import java.util.*;

// 병합정렬과 이분탐색

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nrr = new int[n];
        for(int i=0; i<n; i++) {
            nrr[i] = Integer.parseInt(st.nextToken());
        }
        divide(nrr, 0, n-1); // 쪼개기 함수 호출
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            int target = Integer.parseInt(st.nextToken());
            sb.append(compare(nrr, target)).append('\n');
        }
        
        System.out.print(sb);
    }
    
    public static void divide(int[] arr, int start, int end) { // 쪼개기 함수
        if(start < end) {
            int mid = (start+end) / 2;
        
            divide(arr, start, mid); // 왼
            divide(arr, mid+1, end); // 오
        
            combine(arr, mid, start, end); // 합치기 함수 호출
        }
    }
    
    public static void combine(int[] arr, int mid, int start, int end) { // 합치기 함수
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        
        while(i<=mid && j<=end) {
            if(arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        
        while(i<=mid) temp[k++] = arr[i++];
        while(j<=end) temp[k++] = arr[j++];
        
        for(i = start, k = 0; i<=end; k++, i++) {
            arr[i] = temp[k];
        }
    }
    
    public static int compare(int[] arr, int target) { // 비교 함수
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high) {
            int mid = (low+high)/2;
            
            if(arr[mid] == target) return 1;
            else if(arr[mid] < target) low = mid + 1; // 타겟 R
            else high = mid - 1; // 타겟 L
         }
        
        return 0;
    }
}