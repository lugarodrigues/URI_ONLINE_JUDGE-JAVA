import java.util.Locale;
import java.util.Scanner;

public class URI1002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		
		System.out.printf("A=%.4f%n", r*r*3.14159);
		
		sc.close();

	}

}
