import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1182 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.0");
		
		int c = sc.nextInt();
		char t = sc.next().charAt(0);
		float[][] m = new float[12][12];
		
		for(int i=0; i<12; i++) {
			for (int j=0; j<12;j++) {
				
				m[i][j] = sc.nextFloat();
			}	
		}
		
		if (t == 'S') {
			
			float sum = 0;
			
			for (int j=0; j<12;j++) {
				sum += m[j][c];
			}
			
			System.out.println(df.format(sum));
		}
		
		else if (t == 'M') {
			
			float med = 0;
			
			for (int j=0; j<12;j++) {
				med += m[j][c];
			}
			
			System.out.println(df.format(med/12.0));
		}
			
		sc.close();
	}
}