import java.util.Locale;
import java.util.Scanner;

public class URI1983 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int matMaior = -1;
		double notaMaior = 7.9;
		
		for (int i = 0; i < n; i++) {
			
			int mat = sc.nextInt();
			double nota = sc.nextDouble();
			
			if (nota > notaMaior) {
				notaMaior = nota;
				matMaior = mat;
			}
		}
		if (notaMaior >= 8)
			System.out.println(matMaior);
		else
			System.out.println("Minimum note not reached");
		
		sc.close();
	}
}
