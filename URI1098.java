import java.util.Locale;

public class URI1098 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		float j = 1;
		float i = 0;
		int n = 0;
		while (i<=2.1) {
			
			if (n == 0 || n % 5 == 0) {
				System.out.println("I=" + String.format("%.0f", i) + " J=" + String.format("%.0f", j));
				System.out.println("I=" + String.format("%.0f", i) + " J=" + String.format("%.0f", j + 1));
				System.out.println("I=" + String.format("%.0f", i) + " J=" + String.format("%.0f", j + 2));
			}
			else {
				System.out.println("I=" + String.format("%.1f", i) + " J=" + String.format("%.1f", j) );
				System.out.println("I=" + String.format("%.1f", i) + " J=" + String.format("%.1f", j + 1) );
				System.out.println("I=" + String.format("%.1f", i) + " J=" + String.format("%.1f", j + 2) );
			}
			i += 0.2;
			j += 0.2;
			n++;
		}
	}
}