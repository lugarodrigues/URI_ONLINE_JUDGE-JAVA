import java.util.Scanner;

public class URI1176 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long[] fib = new long[61];
		fib[0] = 0; fib[1] = 1;
		
		for (int i=2; i<=60; i++)
			fib[i] = fib[i-1] + fib[i-2];
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			int x = sc.nextInt();
			
			System.out.println("Fib(" + x + ") = " + fib[x]);
			
		}
		
		sc.close();
	}
}
