import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] tri = new int[3];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            tri[i] = sc.nextInt();
            sum += tri[i];
        }

        if (sum != 180)
            System.out.println("Error");
        else {
            sum = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 3; j++) {
                    if (tri[i] == tri[j])
                        sum++;
                }
            }

            switch (sum) {
                case 0:
                    System.out.println("Scalene");
                    break;
                case 1:
                    System.out.println("Isosceles");
                    break;
                case 3:
                    System.out.println("Equilateral");
                    break;
            }
        }
    }
}