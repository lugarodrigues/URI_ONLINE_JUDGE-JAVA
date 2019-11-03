import java.util.Scanner;

public class URI1973 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] est = new int[n];
		int posAtual = 0;
		long carRoub = 0;
		int maiorPos = 0;
		long carTotal = 0;
		
		for (int i=0; i<n; i++) { 
			est[i] = sc.nextInt();
			carTotal += est[i];
		}
		while ((posAtual>=0) && (posAtual < n) && (est[posAtual] != 0)) {
			
			if (est[posAtual] % 2 == 0) {
				if (posAtual > maiorPos)
					maiorPos = posAtual;
				carRoub++;
				est[posAtual]--;
				posAtual--;
			}
			else {
				if (posAtual > maiorPos)
					maiorPos = posAtual;
				carRoub++;
				est[posAtual]--;
				posAtual++;
			}
		}
		
		System.out.println((maiorPos+1) + " " + (carTotal-carRoub));	
			
		sc.close();
	}
}
