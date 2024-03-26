import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        String hak[] = new String[100]; // 등급
        double jum[] = new double[100]; // 학점

        for (int i = 0; i < 20; i++) { // 문자열 나누기 for문
            //System.out.print(i+1 + "번째 입력 : ");
            s = sc.nextLine();
            int index = s.indexOf(" ");
            s = s.substring(index+1, s.length());
            //System.out.println(s);
            index = s.indexOf(" ");
            jum[i] = Double.parseDouble(s.substring(0,index));
            hak[i] = s.substring(index+1, s.length());
        }
        double tot = 0;
        double score = 0; // tot - 총 학점 수, score - 등급*학점 총점
        for (int i = 0; i < 20; i++) { // 등급 확인 후 학점 계산 for문
            String x = hak[i];
            switch (x) {
                case "A+":
                    score = score + 4.5 * jum[i];
                    tot = tot + jum[i]; // 총 학점 수 더하기
                    break;
                case "A0":
                    score = score +4.0 * jum[i];
                    tot = tot + jum[i]; // 총 학점 수 더하기
                    break;
                case "B+":
                    score = score + 3.5 * jum[i];
                    tot = tot + jum[i];
                    break;
                case "B0":
                    score = score +3.0 * jum[i];
                    tot = tot + jum[i];
                    break;
                case "C+":
                    score = score +2.5 * jum[i];
                    tot = tot + jum[i];
                    break;
                case "C0":
                    score = score +2.0 * jum[i];
                    tot = tot + jum[i];
                    break;
                case "D+":
                    score = score +1.5 * jum[i];
                    tot = tot + jum[i];
                    break;
                case "D0":
                    score = score + 1.0 * jum[i];
                    tot = tot + jum[i];
                    break;
                case "F":
                    score = score +0.0 * jum[i];
                    tot = tot + jum[i];
                    break;
                default:
                    break;
            }
        }
        System.out.printf("%.6f", score/tot);
    }
}