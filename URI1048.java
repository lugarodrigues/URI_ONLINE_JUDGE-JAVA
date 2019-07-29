import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1048 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("#0.00");
		df.setRoundingMode(RoundingMode.HALF_DOWN);

		float sal = sc.nextFloat();
		int perc;

		if (sal <= 400.0)
			perc = 15;

		else if (sal <= 800.0)
			perc = 12;

		else if (sal <= 1200.0)
			perc = 10;

		else if (sal <= 2000.0)
			perc = 7;
		else
			perc = 4;
		
		System.out.println("Novo salario: " + df.format(sal + (sal*perc/100.0)));
		System.out.println("Reajuste ganho: " + df.format(sal*perc/100.0));
		System.out.println("Em percentual: " + perc + " %");

		sc.close();
	}
}
