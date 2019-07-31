import java.util.Locale;
import java.util.Scanner;

public class URI1060 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pos = 0;
		
		for (int i = 1; i <= 6; i++) {
			float x = sc.nextFloat();
			if (x > 0)
				pos++;
		}
		System.out.println(pos + " valores positivos");
		
		sc.close();
	}
}
