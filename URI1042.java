import java.util.Locale;
import java.util.Scanner;

public class URI1042 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int temp = 0;
		int a1 = a;
		int b1 = b;
		int c1 = c;
		
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		if (b > c) {
			temp = c;
			c = b;
			b = temp;
		}
		
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		
		sc.close();
	}
}
