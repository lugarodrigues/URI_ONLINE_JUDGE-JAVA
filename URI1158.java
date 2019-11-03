import java.util.Scanner;

public class URI1158 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			int sum = 0;
			int j = 1;
			
			while (j<=y) {
				
				if (x % 2 != 0) {
					sum += x;
					j++;
					x++;
				}
				else
					x++;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
