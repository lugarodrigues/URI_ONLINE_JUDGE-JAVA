import java.util.Scanner;

public class URI1159 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x != 0) {
			
			int sum = 0;
			int i = 1;
			
			while (i<=5) {
				
				if (x % 2 == 0) {
					sum += x;
					i++;
					x++;
				}
				else
					x++;
			}
			System.out.println(sum);
			x = sc.nextInt();
		}
		sc.close();
	}
}
