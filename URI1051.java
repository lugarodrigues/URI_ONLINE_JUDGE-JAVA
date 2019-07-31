import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1051 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		df.setRoundingMode(RoundingMode.HALF_DOWN);
		
		float sal = sc.nextFloat();
		
		if (sal <= 2000.00)
			System.out.println("Isento");
		else if (sal <= 3000.00)
			System.out.println("R$ " + df.format((sal - 2000.00) * 0.08));
		else if (sal <= 4500.00)
			System.out.println("R$ " + df.format((sal - 3000.00) * 0.18 + 1000.00*0.08));
		else 
			System.out.println("R$ " + df.format((sal - 4500.00) * 0.28 + 1000.00*0.08 + 1500.00*0.18));
		
		
		sc.close();
	}
}
