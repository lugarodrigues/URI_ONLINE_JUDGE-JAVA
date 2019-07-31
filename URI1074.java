import java.util.Scanner;

public class URI1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			int x = sc.nextInt();
			
			if (x == 0)
				System.out.println("NULL");
			else {
				if (x % 2 == 0)
					System.out.print("EVEN ");
				else
					System.out.print("ODD ");
				if (x > 0)
					System.out.println("POSITIVE");
				else
					System.out.println("NEGATIVE");
			}
		}
		sc.close();
	}
}
