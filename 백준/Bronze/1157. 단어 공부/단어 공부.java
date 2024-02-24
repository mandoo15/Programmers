import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26]; // alphabet 26
        String s = sc.next(); // 문자열 s

        for (int i = 0; i < s.length(); i++) { // alphabet 개수 기록
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                arr[s.charAt(i) - 'A'] += 1;
            } else { //if(97 <= s.charAt(i) && s.charAt(i) <= 122)
                arr[s.charAt(i) - 'a'] += 1;
            }
        }
        int max = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++) { // alphabet 개수 비교 -> 최댓값 / 동일값 찾기
            if (max < arr[i]) {
                max = arr[i];
                ch = (char) (i + 65); // 대문자
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}