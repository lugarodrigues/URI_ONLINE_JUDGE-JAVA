import java.util.Scanner;

public class URI1181 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
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
				sum += m[l][j];
			}
			
			System.out.println(sum);
		}
		
		else if (t == 'M') {
			
			float med = 0;
			
			for (int j=0; j<12;j++) {
				med += m[l][j];
			}
			
			System.out.println(med/12.0);
		}
			
		sc.close();
	}
}
