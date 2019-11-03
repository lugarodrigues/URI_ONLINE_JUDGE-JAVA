import java.util.Scanner;

public class URI1858 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int menor = Integer.MAX_VALUE;
		int menorind = 0;
		
		for (int i=0; i<n; i++) {
			
			int t = sc.nextInt();
			if (t < menor) {
				menor = t;
				menorind = i+1;
			}
		}
		
		System.out.println(menorind);
		
		sc.close();
	}
}
