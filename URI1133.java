import java.util.Scanner;

public class URI1133 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x > y) {
			int temp = y;
			y = x;
			x = temp;
		}
		
		for (int i = x+1; i < y; i++) {
			
			if (i % 5 == 2 || i % 5 == 3)
				System.out.println(i);
				
		}
		sc.close();
	}
}

