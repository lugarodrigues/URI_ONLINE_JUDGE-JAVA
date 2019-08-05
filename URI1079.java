import java.util.Locale;
import java.util.Scanner;

public class URI1079 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			System.out.println(String.format("%.1f", (a*2+b*3+c*5)/10.0));
		}
		sc.close();

	}
}
