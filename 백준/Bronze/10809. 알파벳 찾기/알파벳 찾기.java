import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] alpha = new int[26];
        Arrays.fill(alpha, -1); // 전부 -1로 초기화

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a'; // 알파벳을 0~25 인덱스로 변환

            if (alpha[idx] == -1) { // 처음 나왔을 때만 저장
                alpha[idx] = i;
            }
        }
        for(int i=0; i<26; i++){
            System.out.print(alpha[i] + " ");
        }
    }
}
