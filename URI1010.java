import java.util.Locale;
import java.util.Scanner;

public class URI1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cPec = sc.nextInt();
		int nPec = sc.nextInt();
		double vPec = sc.nextDouble();
		
		int cPec2 = sc.nextInt();
		int nPec2 = sc.nextInt();
		double vPec2 = sc.nextDouble();
		
		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", nPec*vPec + nPec2*vPec2));
		
		sc.close();
	}

}
