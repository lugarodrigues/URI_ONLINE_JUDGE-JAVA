import java.util.Scanner;

public class URI1914 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			String nome1 = sc.next();
			String esc1 = sc.next();
			String nome2 = sc.next();
			String esc2 = sc.next();
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int res = num1 + num2;
			
			if (esc1.equals("PAR")) {
				if (res % 2 == 0)
					System.out.println(nome1);
				else
					System.out.println(nome2);
			}
			if (esc1.equals("IMPAR")) {
				if (res % 2 != 0)
					System.out.println(nome1);
				else
					System.out.println(nome2);
			}
		}
		
		sc.close();
	}
}
