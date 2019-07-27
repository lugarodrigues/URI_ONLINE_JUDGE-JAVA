import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double salFix = sc.nextDouble();
		double vendas = sc.nextDouble();
		
		double sal = salFix + vendas*15/100;
		
		DecimalFormat df = new DecimalFormat("#0.00"); //Modelo de formatação para saída
		df.setRoundingMode(RoundingMode.HALF_DOWN); //Setando para a metade exata ser arredondada para baixo
		System.out.println("TOTAL = R$ " + df.format(sal));
		
		sc.close();
	
		}

}