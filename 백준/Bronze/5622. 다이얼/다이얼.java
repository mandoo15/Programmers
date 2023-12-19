import java.util.*;

public class Main {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String str;
                int mintime = 0;
                str = sc.next();
                for(int i=0; i< str.length(); i++) {
                    char st = str.charAt(i);
                    switch(st) {
                        case 'A':
                        case 'B':
                        case 'C':
                            mintime += 2 + 1;
                            break;
                        case 'D':
                        case 'E':
                        case 'F':
                            mintime += 2 + 2;
                            break;
                        case 'G':
                        case 'H':
                        case 'I':
                            mintime += 2 + 3;
                            break;
                        case 'J':
                        case 'K':
                        case 'L':
                            mintime += 2 + 4;
                            break;
                        case 'M':
                        case 'N':
                        case 'O':
                            mintime += 2 + 5;
                            break;
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                            mintime += 2 + 6;
                            break;
                        case 'T':
                        case 'U':
                        case 'V':
                            mintime += 2 + 7;
                            break;
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                            mintime += 2 + 8;
                            break;
                    }
                }
                System.out.println(mintime);
    }
}