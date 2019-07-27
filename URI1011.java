import java.util.Locale;
import java.util.Scanner;

public class URI1011 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		
		System.out.println("VOLUME = " + String.format("%.3f", (4.0/3) * 3.14159 * Math.pow(r, 3)));
	
		sc.close();
	}

}
