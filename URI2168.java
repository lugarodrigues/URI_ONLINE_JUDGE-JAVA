import java.util.Scanner;

public class URI2168 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mapa = new int[n+1][n+1];
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++)
				mapa[i][j] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				
				int tcam = mapa[i][j]+mapa[i+1][j]+mapa[i][j+1]+mapa[i+1][j+1];
				
				if (tcam < 2)
					System.out.print("U");
				else
					System.out.print("S");

			}
			System.out.println();
		}
		
		sc.close();
	}
}
