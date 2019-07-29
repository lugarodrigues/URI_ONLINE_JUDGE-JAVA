import java.util.Locale;
import java.util.Scanner;

public class URI1041 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		
		if (x > 0) {
			
			if (y > 0)
				System.out.println("Q1");
			else if (y < 0)
				System.out.println("Q4");
			else
				System.out.println("Eixo X");
		}
		
		if (x < 0) {
			
			if (y > 0)
				System.out.println("Q2");
			else if (y < 0)
				System.out.println("Q3");
			else
				System.out.println("Eixo X");
		}
		
		if  (x == 0) {
			
			if (y == 0)
				System.out.println("Origem");
			else
				System.out.println("Eixo Y");
		}
		
		sc.close();
	}

}
