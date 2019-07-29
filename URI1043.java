import java.util.Locale;
import java.util.Scanner;

public class URI1043 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		if (Math.abs(b-c) < a && a < (b+c)) {
			if (Math.abs(a-c) < b && b < (a+c)) {
				if (Math.abs(a-b) < c && c < (a+b)) {
					System.out.println("Perimetro = " + String.format("%.1f", (a+b+c)));
				} 
			} 
 		} else
			System.out.println("Area = " + String.format("%.1f", (a+b)*c/2));
			
		
		sc.close();
	}

}
