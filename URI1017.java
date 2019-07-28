import java.util.Locale;
import java.util.Scanner;

public class URI1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int temp = sc.nextInt();
		int dist = sc.nextInt();
		
		System.out.println(String.format("%.3f", (temp*dist) / 12.0));
		
		sc.close();
	}

}