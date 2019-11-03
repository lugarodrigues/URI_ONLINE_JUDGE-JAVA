import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI2147 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("#0.00");
		
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++) {
			
			String pal = sc.nextLine();
			int tam = pal.length();
			double temp = (double) tam / 100.0;
			
			System.out.println(df.format(temp));
		}
		
		sc.close();
	}
}
