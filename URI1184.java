import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1184 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.0");
		
		char t = sc.next().charAt(0);
		float[][] m = new float[12][12];
		
		for(int i=0; i<12; i++) {
			for (int j=0; j<12;j++) {	
				m[i][j] = sc.nextFloat();
			}	
		}
		
		int x = 10;
		float sum = 0;
		
		for(int i=11; i>0; i--) {
			for(int j=x; j>=0; j--) {
				sum += m[i][j];
			}
			x--;
		}
		
		if (t == 'S') {
			System.out.println(df.format(sum));
		}
		else if (t == 'M') {
			System.out.println(df.format(sum/66.0));
		}
	
		sc.close();
	}
}
