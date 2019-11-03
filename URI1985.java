import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1985 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("##0.00");
		
		int n = sc.nextInt();
		double total = 0;
		
		for(int i=0; i<n; i++) {
			
			int cod = sc.nextInt();
			int qtd = sc.nextInt();
			
			switch (cod) {
			
				case 1001: 
					total += qtd*1.5; 
					break;
				case 1002: 
					total += qtd*2.5; 
					break;
				case 1003: 
					total += qtd*3.5; 
					break;
				case 1004: 
					total += qtd*4.5; 
					break;
				case 1005: 
					total += qtd*5.5; 
					break;
			}
		}
		
		System.out.println(dc.format(total));
		
		sc.close();
	}
}
