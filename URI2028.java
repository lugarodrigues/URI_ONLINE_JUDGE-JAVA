import java.util.Scanner;

public class URI2028 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cont = 1;
		
		while(sc.hasNext()) {
			
			int n = sc.nextInt();
			int total = 1;
			int i, j=0;
			
			for (i= 1; i<=n; i++)
				total += i;
			if (n == 0) {
				System.out.println("Caso " + cont + ": " + (total) + " numero");
				System.out.print(0);
			}
			else {
				System.out.println("Caso " + cont + ": " + (total) + " numeros");
				System.out.print(0);
				j=1;
			}
			i=1;
			while (j<=n) {
				for (i=0; i<j; i++)
					System.out.print(" " + j);
				j++;
			}
			System.out.println();
			System.out.println();
			cont++;
		}
		
		sc.close();
	}
}
