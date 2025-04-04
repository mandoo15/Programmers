import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        word = word.toUpperCase();
        int[] alphacnt = new int[26];
        for(int i=0; i<word.length(); i++) {
            alphacnt[word.charAt(i)-'A']++;
        }
        int max = -1;
        int maxCount = 0;
        char answer = '?';
        for(int i=0; i<26; i++) {
            if(alphacnt[i]>max) {
                max = alphacnt[i];
                answer = (char)(i+'A');
                maxCount = 1;
            }
            else if(alphacnt[i]==max) {
                maxCount++;
            }
        }
        if (maxCount > 1) System.out.println("?");
        else System.out.println(answer);
    }
}