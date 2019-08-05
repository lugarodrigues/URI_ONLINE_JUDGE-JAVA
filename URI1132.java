import java.util.Scanner;

public class URI1132 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = 0;
		
		if (x > y) {
			int temp = y;
			y = x;
			x = temp;
		}
		
		for (int i = x; i <= y; i++) {
			
			if (i % 13 != 0)
				sum += i;
			
		}
		System.out.println(sum);
		
		sc.close();
	}
}
