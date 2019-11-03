import java.util.Scanner;

public class URI1165 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			int num = sc.nextInt();
			int sum = 0;
			
			for (int j=2; j<num; j++) 
				if(num % j == 0)
					sum++;
			
			if (sum == 0)
				System.out.println(num + " eh primo");
			else
				System.out.println(num + " nao eh primo");		
		}
		sc.close();
	}
}
