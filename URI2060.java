import java.util.Scanner;

public class URI2060 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int[] mult = {0,0,0,0};
		
		for (int i=0; i<n; i++) {
			
			int num = sc.nextInt();
			
			for(int j=2; j<=5; j++)
				if (num % j == 0)
					mult[j-2]++;
		}
		for (int i=0; i<4; i++)
			System.out.println(mult[i] + " Multiplo(s) de " + (i+2));
		
		sc.close();
	}
}
