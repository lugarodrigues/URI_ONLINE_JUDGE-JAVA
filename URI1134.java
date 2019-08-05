import java.util.Scanner;

public class URI1134 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int al = 0;
		int gs = 0;
		int di = 0;
		
		while (x != 4) {
			if (x==1)
				al++;
			if (x==2)
				gs++;
			if (x==3)
				di++;
			
			x = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + al);
		System.out.println("Gasolina: " + gs);
		System.out.println("Diesel: " + di);
		
		sc.close();
	}
}
