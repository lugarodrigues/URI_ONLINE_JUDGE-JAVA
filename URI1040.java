import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1040 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();
		
		float media = (n1*2+n2*3+n3*4+n4)/10;
		DecimalFormat df = new DecimalFormat("#0.0");
		df.setRoundingMode(RoundingMode.HALF_DOWN);
		
		if (media < 5.0) {
			System.out.println("Media: " + df.format(media));
			System.out.println("Aluno reprovado.");
		}
		else if (media >= 7.0) {
			System.out.println("Media: " + df.format(media));
			System.out.println("Aluno aprovado.");
		}
		else {
			System.out.println("Media: " + df.format(media));
			System.out.println("Aluno em exame.");
			float exame = sc.nextFloat();
			System.out.println("Nota do exame: " + df.format(exame));
			if ((media+exame)/2 >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: " + df.format((media+exame)/2));
			} else {
				System.out.println("Aluno reprovado.");
				System.out.println("Media final: " + df.format((media+exame)/2));
			}
		}
		
		sc.close();
	}
}
