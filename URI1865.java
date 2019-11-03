import java.util.Scanner;

public class URI1865 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			String nome = sc.next();
			int forc = sc.nextInt();
			
			if(nome.equals("Thor"))
				System.out.println("Y");
			else
				System.out.println("N");
			
		}	
		sc.close();
	}
}
