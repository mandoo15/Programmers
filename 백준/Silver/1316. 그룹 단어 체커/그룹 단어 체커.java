import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 몇 개의 단어?
        int cnt = 0; // 그룹단어 갯수
        int t = 1;

        for (int i = 0; i < x; i++) {
            String s = sc.next();
            String[] str = new String[s.length()]; // 알파벳 저장 배열
            char c = s.charAt(0); // 첫 알파벳 저장
            str[0] = Character.toString(c);
            int len = 1;

            for (int j = 1; j < s.length(); j++) {

                if (c != s.charAt(j)) { // 알파벳 다르면 배열에 새로운 알파벳 저장
                    for (int k = 0; k < len; k++) { // 저장 후 나머지 문자열의 알파벳을 비교, 이전 알파벳이 있는지.
                        for (int l = j; l < s.length(); l++) {
                            if (Character.toString(s.charAt(l)).equals(str[k])) {
                                t = 0;
                                break;
                            }
                        }
                    }
                    c = s.charAt(j);
                    str[j] = Character.toString(s.charAt(j));
                    len = j + 1;
                }
            }
            if (t == 1) {
                cnt++;
            }
            t = 1;
        }
        System.out.println(cnt);
        sc.close();
    }
}