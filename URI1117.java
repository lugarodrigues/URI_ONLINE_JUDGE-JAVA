import java.util.Locale;
import java.util.Scanner;

public class URI1117 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		float sum = 0;
		
		while (i < 2) {
			
			float nota = sc.nextFloat();
			
			if (nota >= 0 && nota <= 10.0) {
				sum += nota;
				i++;
			}
			else
				System.out.println("nota invalida");
		}
		System.out.println("media = " + String.format("%.2f", (float)sum/2));
		
		sc.close();
	}
}
