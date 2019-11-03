import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI2164 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0");
		int n = sc.nextInt();
		
		double fibo = ( Math.pow(((1+Math.sqrt(5.0))/2.0), n) - (Math.pow(( (1-Math.sqrt(5.0)) /2.0), n)) ) / Math.sqrt(5.0);
		
		System.out.println(df.format(fibo));
		
		sc.close();
	}
}
