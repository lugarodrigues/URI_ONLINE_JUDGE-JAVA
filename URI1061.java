import java.util.Scanner;

public class URI1061 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// recebendo strings, tratando e transformando os valores que serao utilizados em int
		String dia1 = sc.nextLine().substring(4);
		int d1 = Integer.parseInt(dia1);
		String t1 = sc.nextLine();
		int h1 = Integer.parseInt(t1.substring(0,2));
		int m1 = Integer.parseInt(t1.substring(5,7));
		int s1 = Integer.parseInt(t1.substring(10));
		String dia2 = sc.nextLine().substring(4);;
		int d2 = Integer.parseInt(dia2);
		String t2 = sc.nextLine();
		int h2 = Integer.parseInt(t2.substring(0,2));
		int m2 = Integer.parseInt(t2.substring(5,7));
		int s2 = Integer.parseInt(t2.substring(10));
		
		// equivalencia para o calculo do tempo do evento
		if (s2 < s1) {
			s2 += 60;
			m2--;
		}
		
		if (m2 < m1) {
			m2 += 60;
			h2--;
		}
		
		if (h2 < h1) {
			h2 += 24;
			d2--;
		}
		
		System.out.println((d2-d1) + " dia(s)");
		System.out.println((h2-h1) + " hora(s)");
		System.out.println((m2-m1) + " minuto(s)");
		System.out.println((s2-s1) + " segundo(s)");
		
		sc.close();
	}
}
