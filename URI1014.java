import java.util.Locale;
import java.util.Scanner;

public class URI1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int dist = sc.nextInt();
		double comb = sc.nextDouble();
		
		System.out.println(String.format("%.3f", (double)dist/comb) + " km/l");
		
		sc.close();
	}

}
