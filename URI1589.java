import java.util.Scanner;

public class URI1589 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			int r1 = sc.nextInt();
			int r2 = sc.nextInt();
			
			System.out.println(r1+r2);
			
		}	
		sc.close();
	}
}
