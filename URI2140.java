import java.util.Scanner;

public class URI2140 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] notas = {2,5,10,20,50,100};
		
		while (n != 0 && m != 0) {
			
			boolean p = false;
			
			for(int i=0; i<6; i++) {
				for (int j=0; j<6; j++) {
					
					if((m-n) == (notas[i] + notas[j])) {
						p = true; break;
					}
				}
			}
			
			if (p == true)
				System.out.println("possible");
			else
				System.out.println("impossible");
			
			n = sc.nextInt();
			m = sc.nextInt();
			
		}
		sc.close();
	}
}
