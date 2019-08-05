import java.util.Locale;
import java.util.Scanner;

public class URI1094 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = 0;
		int r = 0;
		int s = 0;
		int total = 0;
		
		for (int i=1; i<=n; i++) {
			
			int q = sc.nextInt();
			char a = sc.next().charAt(0);
			
			total += q;
			
			if (a == 'C')
				c += q;
			else if (a == 'R')
				r += q;
			else
				s += q;
		}
		
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + c);
		System.out.println("Total de ratos: " + r);
		System.out.println("Total de sapos: " + s);
		System.out.println("Percentual de coelhos: " + String.format("%.2f", ((double)c/total) * 100.0) + " %");
		System.out.println("Percentual de ratos: " + String.format("%.2f", ((double)r/total) * 100.0) +" %");
		System.out.println("Percentual de sapos: " + String.format("%.2f", ((double)s/total) * 100.0) + " %");
		sc.close();
	}
}
