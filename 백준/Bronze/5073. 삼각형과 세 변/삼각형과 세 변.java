import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] tri = { 1, 1, 1 };
        while (true) {
            for (int i = 0; i < 3; i++) {
                tri[i] = sc.nextInt();
            }

            if (tri[0] == 0 && tri[1] == 0 && tri[2] == 0)
                break;

            Arrays.sort(tri);
            int sum = 0;

            if (tri[2] > tri[0] + tri[1] || tri[2] == tri[0] + tri[1])
                System.out.println("Invalid");
            else {
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
}