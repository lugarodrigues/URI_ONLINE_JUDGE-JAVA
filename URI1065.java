import java.util.Scanner;

public class URI1065 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int par = 0;
		
		for (int i = 1; i <= 5; i++) {
			
			int x = sc.nextInt();
			if (x % 2 == 0) 
				par++;
		}
		System.out.println(par + " valores pares");
		
		sc.close();
	}
}
