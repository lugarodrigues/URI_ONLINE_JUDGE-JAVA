import java.util.Scanner;

public class URI1007 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		System.out.println("DIFERENCA = " + (a*b - c*d));
		sc.close();
	}

}
