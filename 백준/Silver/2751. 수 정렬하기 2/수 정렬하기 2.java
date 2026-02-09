import java.util.*; // 병합정렬 이용
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //Scanner sc = new Scanner(System.in);
       
        int x = Integer.parseInt(br.readLine());
        int[] arr = new int[x];
       
        for(int i=0; i<x; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        divide(arr, 0, x-1); // 쪼개기 함수 호출
        
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void divide(int arr[], int start, int end) { // 쪼개기 함수
        if(start<end) {
            int mid = (end + start) / 2;
            
            divide(arr, start, mid); // 중간지점 기준 왼쪽 쪼개기
            divide(arr, mid+1, end); // 중간지점 기준 오른쪽 조개기
            
            combine(arr, start, mid, end);
        }
    }
    
    public static void combine(int[] arr, int start, int mid, int end) { // 합치기 함수
        int[] temp = new int[end - start + 1]; // 임시로 담을 바구니
        int i = start; // 왼쪽 시작점
        int j = mid + 1; // 오른쪽 시작점
        int k = 0; // 새 바구니 위치
        
        // 양쪽에 숫자가 남아있는 동안 비교해서 작은 쪽을 담음
        while(i <= mid && j <= end) {
            if(arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        
        // 한쪽 먼저 끝나면 남은 거 때려넣기
        while(i <= mid) temp[k++] = arr[i++];
        while(j <= end) temp[k++] = arr[j++];
        
        // temp 내용을 원래 배열에 복사
        for(i = start, k = 0; i<=end; i++, k++) {
            arr[i] = temp[k];
        }
    }
}