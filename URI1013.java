import java.util.Scanner;

public class URI1013 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = (a + b + Math.abs(a-b))/2;
		int maior2 = (maior + c + Math.abs(maior-c))/2;
		
		System.out.println(maior2 + " eh o maior");
		
		sc.close();
	}

}
