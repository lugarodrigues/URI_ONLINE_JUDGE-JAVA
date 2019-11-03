import java.util.Scanner;

public class URI1921 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int n = sc.nextInt();
		
		//primeiro ponto
		/*for (int i=3; i<n; i++)
			total += 1;
		
		for (int i=2; i<n-1; i++) { //começa do segundo ponto
			
			for (int j=i+2; j<=n; j++)
				total += 1;
		*/
		
		long diag = ((long)n*(n-3))/2;
		
		System.out.println(diag);
		
		sc.close();
	}
}
