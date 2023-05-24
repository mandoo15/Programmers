import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[30];
        int i;
        for(i=0; i<30; i++) {
            array[i] = 0;
        }
        for(i=0; i<28; i++) {
            int s = scanner.nextInt();
            array[s-1] = s;
        }
        for(i=0; i<30; i++) {
            if(array[i] == 0) System.out.println(i+1);
        }
    }
}