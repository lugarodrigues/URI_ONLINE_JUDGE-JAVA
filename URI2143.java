import java.util.Scanner;

public class URI2143 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while (t != 0) {
			
			for (int i=0; i<t; i++) {
				
				int n = sc.nextInt();
				
				if (n % 2 == 0) 
					System.out.println(((n-2)*2+2));
				else
					System.out.println(((n-1)*2+1));
			}
			t = sc.nextInt();
		}				
		sc.close();
	}
}
