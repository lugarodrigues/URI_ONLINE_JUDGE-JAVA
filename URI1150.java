import java.util.Scanner;

public class URI1150 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int z = sc.nextInt();
		int sum = 0;
		int i;
		
		while (z <= x) 
			z = sc.nextInt();
		
		for (i = 0; sum < z; i++) {
			sum += x;
			x++;
		}
		
		System.out.println(i);
		
		sc.close();
	}
}
