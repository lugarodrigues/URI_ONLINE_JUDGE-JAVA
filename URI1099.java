import java.util.Scanner;

public class URI1099 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int sum = 0;
			
			if (x>y) {
				int temp = x;
				x = y;
				y = temp;
			}
			
			for (int j=x+1; j<y; j++) {
				
				if (j % 2 != 0)
					sum += j;
			}
			
			System.out.println(sum);	
		}
		sc.close();
	}
}
