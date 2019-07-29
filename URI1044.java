import java.util.Locale;
import java.util.Scanner;

public class URI1044 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a>b) {
			int temp = b;
			b = a;
			a = temp;
		}
		
		if (b % a == 0)
			System.out.println("Sao Multiplos");
		else
			System.out.println("Nao sao Multiplos");
		
		sc.close();
	}

}
