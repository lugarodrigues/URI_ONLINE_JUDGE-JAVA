import java.util.Scanner;

public class URI1930 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		
		for(int i=0; i<3; i++) {	
			int t = sc.nextInt();
			total += t - 1;
		}
		
		int t = sc.nextInt();
		total += t;
		
		System.out.println(total);
		
		sc.close();
	}
}
