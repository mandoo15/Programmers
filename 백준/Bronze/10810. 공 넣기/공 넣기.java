import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int M = scanner.nextInt();

        int array[] = new int[N];

        for(int a=0; a<M; a++){

            int i = scanner.nextInt();

            int j = scanner.nextInt();

            int k = scanner.nextInt();

            for(int b = i-1; b<j; b++){

                array[b] = k;

            }

        }

        for(int i=0; i<N; i++){

            System.out.print(array[i] + " ");

        }

    }

}