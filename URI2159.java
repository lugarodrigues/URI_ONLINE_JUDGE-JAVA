import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI2159 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.0");
		
		int n = sc.nextInt();
		
		double min = (double) n / Math.log(n);
		double max = 1.25506 * ((double) n / Math.log(n));
		
		System.out.println(df.format(min) + " " + df.format(max));
		
		sc.close();
	}
}
