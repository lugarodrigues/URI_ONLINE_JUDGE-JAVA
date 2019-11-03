import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI2029 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("#0.00");
		
		while(sc.hasNext()) {
			
			double vol = sc.nextDouble();
			double diam = sc.nextDouble();
			
			double areaBase = 3.14 * (diam/2) * (diam/2);
			
			System.out.println("ALTURA = " + df.format(vol/areaBase));
			System.out.println("AREA = " + df.format(areaBase));
			
		}
		sc.close();
	}
}
