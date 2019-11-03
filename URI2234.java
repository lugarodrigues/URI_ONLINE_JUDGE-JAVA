import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class URI2234 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
        
		int totalCac = sc.nextInt();
		int totalPes = sc.nextInt();
		
		System.out.println(df.format((double)totalCac/totalPes));
		
		sc.close();
	}
}