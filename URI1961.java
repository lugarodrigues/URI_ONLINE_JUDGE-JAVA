import java.util.Scanner;

public class URI1961 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int n = sc.nextInt();
		int[] saltos = new int[n];
		boolean fim = true; 
		
		saltos[0] = sc.nextInt();
		
		for (int i=1; i<n; i++) {
			
			saltos[i] = sc.nextInt();
			
			if (p < Math.abs(saltos[i] - saltos[i-1]))
				fim = false;	
		}
		
		if (fim == true)
			System.out.println("YOU WIN");
		else
			System.out.println("GAME OVER");
		
		sc.close();
	}
}
