import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1178 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#0.0000");
		
		double[] x = new double[100];
		x[0] = sc.nextDouble();
		
		for (int i=1; i<100; i++)
			x[i] = x[i-1]/2.0;
		
		for (int i=0; i<100; i++) 
				System.out.println("N[" + i + "] = " + df.format(x[i]));
		
		sc.close();
	}
}
