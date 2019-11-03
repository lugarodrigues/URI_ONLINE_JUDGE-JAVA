import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI2310 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("00.00");
		int n = sc.nextInt();
		int[] total = {0,0,0};
		int[] certos = {0,0,0};
		
		for (int i=0; i<n; i++) {
			
			sc.nextLine();
			sc.nextLine();
			for (int j=0; j<3; j++) {
				int num = sc.nextInt();
				total[j] += num; 
			}
			for (int j=0; j<3; j++) {
				int num = sc.nextInt();
				certos[j] += num; 
			}
		}
		
		System.out.println("Pontos de Saque: " + df.format((double)certos[0]/total[0]*100) + " %.");
		System.out.println("Pontos de Bloqueio: " + df.format((double)certos[1]/total[1]*100) + " %.");
		System.out.println("Pontos de Ataque: " + df.format((double)certos[2]/total[2]*100) + " %.");
		
		sc.close();
	}
}
