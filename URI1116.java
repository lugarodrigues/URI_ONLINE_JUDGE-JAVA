import java.util.Scanner;

public class URI1116 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n;i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0)
				System.out.println("divisao impossivel");
			else {
				System.out.println(String.format("%.1f", (float)x/y));
			}
		}	
		sc.close();
	}
}
