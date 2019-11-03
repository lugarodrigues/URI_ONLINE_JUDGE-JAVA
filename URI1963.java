import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1963 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("##0.00");
		
		double vAnt = sc.nextDouble();
		double vNovo = sc.nextDouble();
		
		System.out.println(df.format(((vNovo-vAnt)/vAnt)*100) + "%");
		
		sc.close();
	}
}
