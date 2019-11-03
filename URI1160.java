import java.util.Locale;
import java.util.Scanner;

public class URI1160 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			int pa = sc.nextInt();
			int pb = sc.nextInt();
			double g1 = sc.nextDouble();
			double g2 = sc.nextDouble();
			
			int anos = 0;
			
			while (pa <= pb) {
				
				pa = pa + (int)(pa*g1/100);
				pb = pb + (int)(pb*g2/100);
				
				anos++;
			}
			
			if (anos <= 100) {
				System.out.println(anos + " anos.");
			}
			else
				System.out.println("Mais de 1 seculo.");
			
		}
		
		sc.close();
	}
}
