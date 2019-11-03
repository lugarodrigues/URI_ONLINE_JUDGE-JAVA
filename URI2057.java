import java.util.Scanner;

public class URI2057 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int saida = sc.nextInt();
		int tempo = sc.nextInt();
		int fuso = sc.nextInt();
		
		int total = saida + tempo + fuso;
		
		if (total < 24 && total >= 0)
			System.out.println(total);
		else if (total >= 24)
			System.out.println(total - 24);
		else
			System.out.println(total + 24);
		
		sc.close();
	}
}
