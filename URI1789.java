import java.util.Scanner;

public class URI1789 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			
			int n = sc.nextInt();
			int les1 = sc.nextInt();
			
			for (int i=1; i<n; i++) {
				
				int les2 = sc.nextInt();
				
				if (les2 > les1)
					les1 = les2;
			}
			
			if (les1 < 10)
				System.out.println("1");
			else if (les1 < 20)
				System.out.println("2");
			else
				System.out.println("3");
		}
		sc.close();
	}
}
