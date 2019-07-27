import java.util.Locale;
import java.util.Scanner;

public class URI1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int nHor = sc.nextInt();
		double vHor = sc.nextDouble();
		
		System.out.println("NUMBER = " + num);
		System.out.println("SALARY = U$ " + String.format("%.2f", (nHor*vHor)));
		
		sc.close();
	}

}
