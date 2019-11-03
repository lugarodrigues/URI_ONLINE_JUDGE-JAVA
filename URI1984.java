import java.util.Scanner;

public class URI1984 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		/*
		long num = sc.nextLong();
		
		while (num > 10) {
			
			long n = num % 10;
			num /= 10;
			System.out.print(n);

		}
		
		System.out.println(num);
		*/
		
		String num = sc.nextLine();
		int n = num.length();
		
		for (int i = n-1; i >= 0; i--) {
			
			System.out.print(num.charAt(i));
		}
		
		System.out.println();
		
		sc.close();
	}
}
