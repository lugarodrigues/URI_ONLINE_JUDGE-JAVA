import java.util.Scanner;

public class URI1151 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] fibo = new int[n];
		
		if (n == 1) 
			System.out.println("0");
		
		else if (n == 2) 
			System.out.println("0 1");
		
		else {
			fibo[0] = 0;
			fibo[1] = 1;
			
			for (int i=2; i<n; i++) {
				fibo[i] = fibo[i-1]+fibo[i-2];
			}
			
			for (int i=0; i<n-1; i++)
				System.out.print(fibo[i] + " ");
			
			System.out.println(fibo[n-1]);
		}
		sc.close();
	}
}
