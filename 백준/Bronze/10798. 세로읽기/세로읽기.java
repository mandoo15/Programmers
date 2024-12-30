import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[][] word = new String[5][15];

        for (int k = 0; k < 5; k++) {
            for (int l = 0; l < 15; l++) {
                word[k][l] = "-1";
            }
        }

        for (int i = 0; i < 5; i++) {
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                word[i][j] = Character.toString(str.charAt(j));
            }
        }

        String s = "";
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (word[j][i] != "-1") {
                    s += word[j][i];
                }
            }
        }

        System.out.println(s);
    }
}