import java.util.Scanner;

public class URI2221 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			int bonus = sc.nextInt();
			
			int[] poks = new int[6];
			
			for (int j=0; j<6; j++)
				poks[j] = sc.nextInt();
			
			int atq1 = ((poks[0]+poks[1])/2); 
			int atq2 = ((poks[3]+poks[4])/2);
			
			if (poks[2] % 2 == 0)
				atq1 += bonus;

			if (poks[5] % 2 == 0)
				atq2 += bonus;
			
			if (atq1 > atq2)
				System.out.println("Dabriel");
			else if (atq2 > atq1)
				System.out.println("Guarte");
			else
				System.out.println("Empate");
		}	
		sc.close();
	}
}
