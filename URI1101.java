import java.util.Scanner;

public class URI1101 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		while (m>0 && n>0) {
			int sum = 0;
			
			if (m>n) {
				int temp = n;
				n = m;
				m = temp;
			}
			
			for(int i=m; i<=n; i++) {
				System.out.print(i + " ");
				sum += i;
			}
			
			System.out.println("Sum=" + sum);
			
			m = sc.nextInt();
			n = sc.nextInt();
		}
		
		sc.close();
	}
}
