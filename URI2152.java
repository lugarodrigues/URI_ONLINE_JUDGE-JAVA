import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class URI2152 {

	public static void main(String[] args) {
		
		NumberFormat nf = new DecimalFormat("00");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			int h = sc.nextInt();
			int m = sc.nextInt();
			int o = sc.nextInt();
			
			String h2 = nf.format(h);
			String m2 = nf.format(m);
			
			if (o == 0)
				System.out.println(h2 + ":" + m2 +  " - A porta fechou!");
			else
				System.out.println(h2 + ":" + m2 +  " - A porta abriu!");
		}
		
		sc.close();
	}
}
