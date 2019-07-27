import java.util.Locale;
import java.util.Scanner;

public class URI1006 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		System.out.printf("MEDIA = %.1f\n", (a*2 + b*3 + c*5) / 10);
		
		sc.close();
	}

}
