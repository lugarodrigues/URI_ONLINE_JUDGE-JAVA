import java.util.Scanner;

public class URI1557 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			
			int[][] mat = new int[n][n];
			int i, j, x=1;
			int x1=1;
			
			for (i=0; i<n; i++) {
				x = x1;
				for (j=0; j<n; j++) {
					mat[i][j] = x;
					x*=2;
				}
				x1*=2;
			}
			
			x/=2; //maior numero
			int dig = 1;
			
			while (x >= 10) { //digitos do maior numero	
				x /= 10;
				dig++;
			}
			
			if (dig == 1) {
				for (i=0; i<n; i++) {
					for (j=0; j<n-1; j++) {
						System.out.printf("%d ",mat[i][j]);
					}
					System.out.printf("%d%n",mat[i][n-1]);
				}
				System.out.println();
			}
			else if (dig == 2) {
				for (i=0; i<n; i++) {
					for (j=0; j<n-1; j++) {
						System.out.printf("%2d ",mat[i][j]);
					}
					System.out.printf("%2d%n",mat[i][n-1]);
				}
				System.out.println();
			}
			else if (dig == 3) {
				for (i=0; i<n; i++) {
					for (j=0; j<n-1; j++) {
						System.out.printf("%3d ",mat[i][j]);
					}
					System.out.printf("%3d%n",mat[i][n-1]);
				}
				System.out.println();
			}
			else if (dig == 4) {
				for (i=0; i<n; i++) {
					for (j=0; j<n-1; j++) {
						System.out.printf("%4d ",mat[i][j]);
					}
					System.out.printf("%4d%n",mat[i][n-1]);
				}
				System.out.println();
			}
			else if (dig == 5) {
				for (i=0; i<n; i++) {
					for (j=0; j<n-1; j++) {
						System.out.printf("%5d ",mat[i][j]);
					}
					System.out.printf("%5d%n",mat[i][n-1]);
				}
				System.out.println();
			}
			else if (dig == 6) {
				for (i=0; i<n; i++) {
					for (j=0; j<n-1; j++) {
						System.out.printf("%6d ",mat[i][j]);
					}
					System.out.printf("%6d%n",mat[i][n-1]);
				}
				System.out.println();
			}
			else if (dig == 7) {
				for (i=0; i<n; i++) {
					for (j=0; j<n-1; j++) {
						System.out.printf("%7d ",mat[i][j]);
					}
					System.out.printf("%7d%n",mat[i][n-1]);
				}
				System.out.println();
			}
			else if (dig == 8) {
				for (i=0; i<n; i++) {
					for (j=0; j<n-1; j++) {
						System.out.printf("%8d ",mat[i][j]);
					}
					System.out.printf("%8d%n",mat[i][n-1]);
				}
				System.out.println();
			}
			
			else {
				for (i=0; i<n; i++) {
					for (j=0; j<n-1; j++) {
						System.out.printf("%9d ",mat[i][j]);
					}
					System.out.printf("%9d%n",mat[i][n-1]);
				}
				System.out.println();
			}
			
			n = sc.nextInt();			
		}
		
		sc.close();
	}
}
