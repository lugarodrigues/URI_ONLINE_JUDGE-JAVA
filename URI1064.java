import java.util.Locale;
import java.util.Scanner;

public class URI1064 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pos = 0;
		double sum = 0.0;
		
		for (int i = 1; i <= 6; i++) {
			double x = sc.nextFloat();
			if (x > 0) {
				pos++;
				sum += x;
			}
		}
		
		System.out.println(pos + " valores positivos");
		System.out.printf("%.1f\n", sum/pos);
		
		sc.close();
	}
}
