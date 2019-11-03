import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1174 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#0.0");
		
		float[] x = new float[100];
		
		for (int i=0; i<100; i++)
			x[i] = sc.nextFloat();
		
		for (int i=0; i<100; i++) 
			if (x[i] <=10)
				System.out.println("A[" + i + "] = " + df.format(x[i]));
		
		sc.close();
	}
}
