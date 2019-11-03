import java.util.Scanner;

public class URI2006 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int certo = sc.nextInt();
		int total = 0;
		
		for (int i=0; i<5; i++) {
			
			int comp = sc.nextInt();
			
			if (comp == certo)
				total++;
				
		}
		
		System.out.println(total);
		
		sc.close();
	}
}
