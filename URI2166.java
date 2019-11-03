import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI2166 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0000000000");
		
		int n = sc.nextInt();
		double res = 1;
		double den = 2;
		
		for (int i=1; i<n; i++)
			den = 2 + 1.0/den;
	
		if (n == 0)
			System.out.println(df.format(res));
		else {
			res += 1 / den;
			System.out.println(df.format(res));
		}
		sc.close();
	}
}