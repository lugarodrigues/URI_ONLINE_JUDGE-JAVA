import java.util.Scanner;

public class URI2126 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = 1;
		
		while (sc.hasNext()) {
			
			String sub = sc.nextLine();
			String total = sc.nextLine();
			int subs = 0;
			int ultPos = 0;
			
			for (int i=0; i<(total.length()-sub.length()+1); i++) {
				
				if(total.substring(i, i+sub.length()).equals(sub)) {
					
					subs++;
					ultPos = i;
				}
			}
			
			if (subs > 0) {
				System.out.println("Caso #" + casos + ":");
				System.out.println("Qtd.Subsequencias: " + subs);
				System.out.println("Pos: " + (ultPos+1));
			} else {
				System.out.println("Caso #" + casos + ":");
				System.out.println("Nao existe subsequencia");	
			}
			System.out.println();
			casos++;
		}	
		sc.close();
	}
}