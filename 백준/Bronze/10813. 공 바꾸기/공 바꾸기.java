import java.util.*;


public class Main {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int M = scanner.nextInt();

        int array[] = new int[N];

        for(int i=0; i<N; i++){

            array[i] = i+1;

        }

        int temp;

        for(int k=0; k<M; k++){

            int i = scanner.nextInt();

            int j = scanner.nextInt();

            temp = array[i-1];

            array[i-1] = array[j-1];

            array[j-1] = temp;

        }

        for(int i=0; i<N; i++){

            System.out.print(array[i] + " ");

        }

    }

}