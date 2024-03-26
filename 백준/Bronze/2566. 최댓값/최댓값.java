import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10]; // 9X9 2차원 배열 선언 ( 행렬 )
        for(int i=1; i<10; i++) {
            for(int j=1; j<10; j++){
                arr[i][j] = sc.nextInt(); // 배열에 숫자 입력받기
            }
        }
        int max = 0, n = 0, m = 0; // max : 최댓값, n : 행, m : 열
        for(int i=1; i<10; i++) {
            for(int j=1; j<10; j++) {
                if(arr[i][j] > max || arr[i][j] == max){
                    max = arr[i][j];
                    n = i; m = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(n + " " + m);
    }
}