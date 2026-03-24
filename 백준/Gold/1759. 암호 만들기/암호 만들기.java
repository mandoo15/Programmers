import java.util.*;
import java.io.*;
// 한개의 모음, 두개의 자음 ( 최소 )
// 정렬된 문자열 -> 오름차순( 사전순 )

public class Main {
    static int L, C;
    static char[] str;
    static char[] results;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        str = new char[C];
        results = new char[L];
        
        st = new StringTokenizer(br.readLine()); // 중요 !
        for(int i=0; i<C; i++) {
            str[i] = st.nextToken().charAt(0); // char형
        }
        Arrays.sort(str); // 사전순 정렬은 미리 정렬만 해두면 굳이 검사할 필요 없어.
        
        check(0, 0); // start, count - 뽑기 함수 호출
        System.out.println(sb);
    }
    
    public static void check(int start, int count) { // 뽑기 함수
        if(count == L) {
            if(isValid()) {
                for(char c : results) sb.append(c);
                sb.append('\n');
            }
            return;
        }
        
        for(int i=start; i<C; i++) {
            results[count] = str[i];
            check(i+1, count+1);
        }
    }
    
    public static boolean isValid() { // 자음과 모음 조건 검사
        int mo = 0;
        int ja = 0;
        
        for(char c : results) {
            if(c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i') {
                mo++;
            }
            else {
                ja++;
            }
        }
        
        return mo>=1 && ja>=2; // 조건이 맞으면 t 아니면 f
    }
}