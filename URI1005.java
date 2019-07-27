import java.util.Locale;
import java.util.Scanner;

public class URI1005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.printf("MEDIA = %.5f\n", (a*3.5 + b*7.5) / 11);
		
		sc.close();
	}

}
