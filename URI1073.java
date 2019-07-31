import java.util.Scanner;

public class URI1073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextInt();
		
		for (long i = 1; i <= n; i++) {
			
			if (i % 2 == 0) {
				long quad = i*i;
				System.out.println(i + "^" + 2 + " = " + quad);
			}
				
		}
		sc.close();
	}
}
