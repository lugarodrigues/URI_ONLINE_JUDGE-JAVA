import java.util.Scanner;

public class URI1933 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
				
		if (c1>=c2)
			System.out.println(c1);
		else
			System.out.println(c2);
		
		sc.close();
	}
}
