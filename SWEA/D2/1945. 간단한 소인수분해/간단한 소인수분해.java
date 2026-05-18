import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n = sc.nextInt();
            
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            
            while(n%2==0) {
                    a++;
                    n /= 2;
                }
            while(n%3==0) {
                    b++;
                    n /= 3;
                }
            while(n%5==0) {
                    c++;
                    n /= 5;
                }
            while(n%7==0) {
                    d++;
                    n /= 7;
                }
            while(n%11==0) {
                    e++;
                    n /= 11;
                }
            System.out.println("#" + test_case + " " + a + " " + b + " " + c + " " + d + " " + e); 
		}
	}
}