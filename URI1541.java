import java.util.Scanner;

public class URI1541 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int l1 = sc.nextInt();
		
		while (l1 != 0) {
			int l2 = sc.nextInt();
			int perc = sc.nextInt();
			
			double x = (double)(l1*l2*100)/perc;
			
			int l3 = (int)Math.sqrt(x);
			
			System.out.println(l3);
			
			l1 = sc.nextInt();
		}
		
		
		sc.close();
		
	}
}
