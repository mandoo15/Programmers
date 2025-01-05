import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // n 입력받기

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        // 정렬된 결과 출력
        for (int i = 0; i < n; i++) {
            bw.write(arr[i] + "\n"); // 정렬된 결과 출력
        }

        bw.flush(); // 버퍼에 저장된 데이터를 출력
        bw.close(); // BufferedWriter 닫기
        br.close(); // BufferedReader 닫기
    }
}