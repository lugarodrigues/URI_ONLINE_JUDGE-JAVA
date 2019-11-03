import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1187 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.0");
		
		char t = sc.next().charAt(0);
		double[][] m = new double[12][12];
		
		for(int i=0; i<12; i++) {
			for (int j=0; j<12;j++) {	
				m[i][j] = sc.nextDouble();
			}	
		}
		
		int x = 1;
		double sum = 0;
		int y = 10;
		
		for(int i=0; i<5; i++) {
			for(int j=x; j<=y; j++) {
				sum += m[i][j];
			}
			x++;
			y--;
		}
		
		if (t == 'S') {
			System.out.println(df.format(sum));
		}
		else if (t == 'M') {
			System.out.println(df.format(sum/30.0));
		}
	
		sc.close();
	}
}
