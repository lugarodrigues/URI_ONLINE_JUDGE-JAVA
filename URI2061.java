import java.util.Scanner;

public class URI2061 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int abas = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			
			String acao = sc.nextLine();
			
			if (acao.equals("fechou"))
				abas++;
			else
				abas--;
		}
		
		System.out.println(abas);
		
		sc.close();
	}
}
