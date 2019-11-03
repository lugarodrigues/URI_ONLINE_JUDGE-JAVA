import java.util.Scanner;

public class URI1478 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			
			int[][] mat = new int[n][n];
			int i, j;
			
			for (i = 0; i<n; i++) {
				for (j = 0; j<n; j++) {
					mat[i][j] = Math.abs(i-j) + 1;
				}
			}
			
			for (i = 0; i<n; i++) {
				for (j = 0; j<n-1; j++) {
					System.out.printf("%3d ",mat[i][j]);
				}
				System.out.printf("%3d%n",mat[i][n-1]);
			}
			System.out.println();
			
			n = sc.nextInt();
		}
		
		sc.close();
	}
}
