import java.util.Locale;
import java.util.Scanner;

public class URI1038 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		
		switch (cod) {
			case 1:
				System.out.println("Total: R$ " + String.format("%.2f", 4.0 * qtd));
				break;
			case 2:
				System.out.println("Total: R$ " + String.format("%.2f", 4.5 * qtd));
				break;
			case 3:
				System.out.println("Total: R$ " + String.format("%.2f", 5.0 * qtd));
				break;
			case 4:
				System.out.println("Total: R$ " + String.format("%.2f", 2.0 * qtd));
				break;
			case 5:
				System.out.println("Total: R$ " + String.format("%.2f", 1.5 * qtd));
				break;
		}
		
		sc.close();
	}
}
