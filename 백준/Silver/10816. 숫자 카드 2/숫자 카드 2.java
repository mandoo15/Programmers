import java.io.*;
import java.util.*;

// 병합정렬, 이분탐색

public class Main {
    public static void main(String args[]) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        divide(arr, 0, n-1); // 쪼개기 함수 호출
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            int target = Integer.parseInt(st.nextToken());
            int up = UpperBound(arr, target); // 개수세기 함수 호출
            int low = LowerBound(arr, target); // 개수세기 함수 호출
            sb.append(up-low).append(" ");
        }
        
        System.out.println(sb);
    }
    
    public static void divide(int[] arr, int start, int end) { // 쪼개기 함수
        if(start<end) {
            int mid = (start+end) / 2;
            
            divide(arr, start, mid); // 왼쪽
            divide(arr, mid+1, end); // 오른쪽
            
            combine(arr, mid, start, end); // 합치기 함수 호출
        }
    }
    
    public static void combine(int[] arr, int mid, int start, int end) { // 합치기 함수
        int[] temp = new int[end-start+1]; // 임시로 저장
        int i = start; // 왼쪽 시작
        int j = mid + 1; // 오른쪽 시작
        int k = 0; // temp 인덱스
        
        while(i<=mid && j<=end) {
            if(arr[i]<=arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        
        while(i<=mid) temp[k++] = arr[i++];
        while(j<=end) temp[k++] = arr[j++];
        
        for(i = start, k = 0; i<=end; k++, i++){
            arr[i] = temp[k];
        }
    }
    
    public static int LowerBound(int[] arr, int target) {
        int low = 0; // start
        int high = arr.length; // end
        
        while(low<high) {
            int mid = (low+high)/2;
            
            if(target <= arr[mid]) high = mid;
            else low = mid + 1;
        }
        
        return low;
    }
    
    public static int UpperBound(int[] arr, int target) {
        int low = 0; // start
        int high = arr.length; // end
        
        while(low<high) {
            int mid = (low+high)/2;
            
            if(target < arr[mid]) high = mid;
            else low = mid + 1;
        }
        
        return low;
    }
}