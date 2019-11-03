import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1534 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linha;
		
		while ((linha = br.readLine()) != null) {
			
			int n = Integer.parseInt(linha);
			
			int[][] mat = new int[n][n];
			
			for (int i = 0; i<n; i++) {
				for (int j = 0; j<n; j++) {
					if (i+j==n-1) {
						mat[i][j] = 2;
					}
					else if (i==j) {
						mat[i][j] = 1;
					}
					else {
						mat[i][j] = 3;
					}
				}
			}
			for (int i = 0; i<n; i++) {
				for (int j = 0; j<n-1; j++) {
					System.out.print(mat[i][j]);
				}
				System.out.println(mat[i][n-1]);
			}
		}
	}
}
