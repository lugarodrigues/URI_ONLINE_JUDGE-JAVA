import java.util.Scanner;

public class URI1435 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			
			int[][] mat = new int[n][n];
			
			for (int i = 0; i<n; i++) {        //atribuir 1 para matriz maior
				for (int j = 0; j<n; j++) {
					mat[i][j] = 1;
				}
			}
			
			int n2 = n - 2;
			int x = 1;
			
			while (n2 > 0) { 
				for (int i = x ; i<n2+x; i++) {        
					for (int j = x; j<n2+x; j++) {
						mat[i][j] += 1;
					}	
				}
				n2=n2-2;
				x++;
			}
			
			for (int i = 0; i<n; i++) {        //imprimir
				for (int j = 0; j<n-1; j++) {
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
