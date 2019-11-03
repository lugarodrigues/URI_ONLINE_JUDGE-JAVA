import java.util.Scanner;

public class URI1827 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {

			int n = sc.nextInt();
			
			int[][] mat = new int[n][n];
			
			int n2 = n/3;
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					
					if (i == j)
						mat[i][j] = 2;
					else if (i + j == n-1)
						mat[i][j] = 3;
					else
						mat[i][j] = 0;			
				}
			}
			
			for (int i = n2; i < n-n2; i++) {
				for (int j = n2; j < n-n2; j++) {
					if (i == j & i+j==n-1)
						mat[i][j] = 4;
					else
						mat[i][j] = 1;			
				}
			}
			
			
			for (int i=0; i<n; i++) {
				for (int j=0; j<n-1; j++) {
					System.out.print(mat[i][j]);
				}
				System.out.println(mat[i][n-1]);
			}
			System.out.println();
		
		}
		sc.close();
	}
}
