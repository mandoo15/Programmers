import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        int i, j, max=0, sum = 0, cnt = 1;
        for(i=0; i<3; i++) {
            array[i] = scanner.nextInt();
            if(array[i]>max) max = array[i];
        }
        for(i=0; i<3; i++) {
            for(j=0; j<3; j++) {
                if(array[i] == array[j]) {
                    if(i!=j) sum = array[i];
                    cnt+=1;
                }
            }
        }
        cnt -=3;
        switch(cnt/2){
            case 0:
                System.out.print(max*100);
                break;
            case 1:
                System.out.print(1000 + sum*100);
                break;
            case 3:
                System.out.print(10000 + sum*1000);
                break;
        }
    }
}