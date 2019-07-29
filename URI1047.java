import java.util.Scanner;

public class URI1047 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		
		if (h1 == h2 && m1 == m2)
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		else {
			if (m1 > m2) {
				m2 += 60;
				h2--;
			}
			if (h1 > h2)
				h2 += 24;
			System.out.println("O JOGO DUROU " + (h2-h1) + " HORA(S) E " + (m2-m1) + " MINUTO(S)");
		}
		sc.close();
	}

}
