import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class URI2311 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("00.00");
		List<Double> notas = new ArrayList();
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			notas.clear();
			sc.nextLine();
			String nome = sc.nextLine();
			double totalNotas = 0;
			double dif = sc.nextDouble();
			for (int j=0; j<7; j++)
				notas.add(sc.nextDouble());
			notas.sort(null);
			for (int j=1;j<6; j++)
				totalNotas += notas.get(j);
			
			System.out.println(nome + " " + df.format(totalNotas*dif));
			
		}
		
		sc.close();
	}

}
