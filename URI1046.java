import java.util.Scanner;

public class URI1046 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hIni = sc.nextInt();
		int hFim = sc.nextInt();
		
		if (hIni >= hFim)
			hFim += 24;
		
		System.out.println("O JOGO DUROU " + (hFim - hIni) + " HORA(S)");
		
		sc.close();
	}
}
