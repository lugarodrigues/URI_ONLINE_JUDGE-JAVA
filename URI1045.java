import java.util.Locale;
import java.util.Scanner;

public class URI1045 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();

		if (a < b) {
			float temp = b;
			b = a;
			a = temp;
		}
		if (b < c) {
			float temp = c;
			c = b;
			b = temp;
		}
		if (a < b) {
			float temp = b;
			b = a;
			a = temp;
		}

		if (a >= (b + c))
			System.out.println("NAO FORMA TRIANGULO");
		else {
			if (a * a == b * b + c * c)
				System.out.println("TRIANGULO RETANGULO");
			if (a * a > b * b + c * c)
				System.out.println("TRIANGULO OBTUSANGULO");
			if (a * a < b * b + c * c)
				System.out.println("TRIANGULO ACUTANGULO");
			if (a == b && b == c)
				System.out.println("TRIANGULO EQUILATERO");
			if (a == b ^ b == c)
				System.out.println("TRIANGULO ISOSCELES");
		}
		sc.close();
	}
}
