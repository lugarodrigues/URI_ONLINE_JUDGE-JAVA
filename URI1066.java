import java.util.Scanner;

public class URI1066 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		int pos = 0;
		int neg = 0;
		
		for (int i = 1; i <= 5; i++) {
			
			int x = sc.nextInt();
			if (x % 2 == 0) 
				par++;
			else
				impar++;
			if (x > 0)
				pos++;
			if (x < 0)
				neg++;
		}
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(pos + " valor(es) positivo(s)");
		System.out.println(neg + " valor(es) negativo(s)");
		
		sc.close();
	}
}
