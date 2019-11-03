import java.util.Locale;
import java.util.Scanner;

public class URI1156 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double s = 1;
		int j = 3;
		
		for (int i=2; j<=39; i=i*2) {
			s = s + (double)j/i;
			j=j+2;
		}
		
		System.out.println(String.format("%.2f", s));
		
		sc.close();
	}
}