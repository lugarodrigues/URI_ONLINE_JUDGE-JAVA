import java.util.Locale;
import java.util.Scanner;

public class URI1154 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		int i = 0;
		
		while (n >= 0) {
			sum += n;
			i++;
			n = sc.nextInt();
		}
		
		double media = (double)sum/i;
		
		System.out.println(String.format("%.2f", media));
		
		sc.close();
	}
}
