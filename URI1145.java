import java.util.Scanner;

public class URI1145 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int linhas;
		int n = 1;
		
		if (y % x == 0)
			linhas = y/x;
		else
			linhas = y/x+1;
		
			for (int j=1; j<=linhas; j++) {
				for (int i = 1; i <= x-1; i++) {
					if (n <= y ) {
						System.out.print(n + " ");
						n++;
					}
				}
				if (n <= y ) {
					System.out.println(n);
					n++;
				}
			}	
			
		sc.close();
	}
}
