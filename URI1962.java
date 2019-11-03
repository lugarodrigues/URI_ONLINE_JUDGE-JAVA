import java.util.Scanner;

public class URI1962 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			int ano = sc.nextInt();
			
			if (ano < 2015)
				System.out.println((2015 - ano) + " D.C.");
			else
				System.out.println(((ano + 1)- 2015) + " A.C.");
			
		}
		sc.close();
	}
}
