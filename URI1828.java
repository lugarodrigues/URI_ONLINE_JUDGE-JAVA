import java.util.Scanner;

public class URI1828 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[][] resp = new String[][] {{"tesoura","papel"},{"papel","pedra"},{"pedra","lagarto"},{"lagarto","Spock"},{"Spock","tesoura"},
									      {"tesoura","lagarto"},{"lagarto","papel"},{"papel","Spock"},{"Spock","pedra"},{"pedra","tesoura"}};
		
		for (int i=0; i<n; i++) {
			
			int x = 0;
			
			String um = sc.next();
			String dois = sc.next();
			
			if (um.contentEquals(dois))
					System.out.println("Caso #" + (i+1) + ": De novo!");
			
			else {
				for (int j=0; j<10; j++) {
					if (resp[j][0].contentEquals(um) && resp[j][1].contentEquals(dois))
						x = 1;
				}
				if (x == 1)
					System.out.println("Caso #" + (i+1) + ": Bazinga!");
				else
					System.out.println("Caso #" + (i+1) + ": Raj trapaceou!");
			}
		}
		
		sc.close();
	}
}
