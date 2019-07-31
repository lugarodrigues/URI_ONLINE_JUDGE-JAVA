import java.util.Scanner;

public class URI1070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 1;
		
		while (i <= 6) {
			
			if (n % 2 != 0) {
				System.out.println(n);
				i++;
			}
			n++;
		}
		sc.close();
	}
}
