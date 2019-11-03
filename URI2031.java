import java.util.Scanner;

public class URI2031 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			
			String jg1 = sc.nextLine();
			String jg2 = sc.nextLine();
			
			switch (jg1) {
			
				case "ataque": 
					if (jg2.equals(jg1)) {
						System.out.println("Aniquilacao mutua");
					}
					else
						System.out.println("Jogador 1 venceu");
					break;
				case "pedra":
					if (jg2.equals(jg1))
						System.out.println("Sem ganhador");
					else if (jg2.equals("ataque"))
						System.out.println("Jogador 2 venceu");
					else
						System.out.println("Jogador 1 venceu");
					break;
				case "papel":
					if (jg2.equals(jg1)) {
						System.out.println("Ambos venceram");
					}
					else
						System.out.println("Jogador 2 venceu");
					break;
			}	
		}	
		sc.close();
	}
}
